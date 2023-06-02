package com.example.demomap.common.utils;

import com.example.demomap.common.constants.PageInfo;
import com.example.demomap.common.page.ListPageResponse;
import com.example.demomap.common.page.Page;
import com.google.common.base.CaseFormat;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Map;

public class PageUtils {


    public static Pageable getPageFromUrl(Map<String, String> paramUrl) {

        Page.page = Helper.parseIntegerWithDefault(paramUrl.get("page"), PageInfo.DEFAULT_PAGE);
        Page.size = Helper.parseIntegerWithDefault(paramUrl.get("size"), PageInfo.PAGE_SIZE);

        Page.sort = paramUrl.get("sort");

        if (Page.sort == null || Page.sort.length() <= 0) {
            Page.sort = PageInfo.DEFAULT_PAGE_SORT;

        }
        String[] arrSort = Page.sort.split("\\s");

        Sort.Direction sortDirection = null;
        try {
            sortDirection = Sort.Direction.fromString(arrSort[1]);
        } catch (Exception e) {
            sortDirection = Sort.DEFAULT_DIRECTION;
        }

        Sort sort = Sort.by(sortDirection,
                CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, arrSort[0]));

        return PageRequest.of(Page.page, Page.size, sort);
    }

    public static Pageable getPageFromUrlNoSort(Map<String, String> paramUrl) {

        Page.page = Helper.parseIntegerWithDefault(paramUrl.get("page"), PageInfo.DEFAULT_PAGE);
        Page.size = Helper.parseIntegerWithDefault(paramUrl.get("size"), PageInfo.PAGE_SIZE);

        return PageRequest.of(Page.page, Page.size);
    }

    public static <T> ListPageResponse<T> formatPageResponse(org.springframework.data.domain.Page<T> page) {
        ListPageResponse<T> responseObject = new ListPageResponse<>();
        responseObject.setContent(page.getContent());
        responseObject.setNumber(page.getNumber());
        responseObject.setSize(page.getSize());
        responseObject.setSort(String.valueOf(page.getSort()));
        responseObject.setTotalElements(page.getTotalElements());
        responseObject.setTotalPages(page.getTotalPages());
        return responseObject;
    }
}
