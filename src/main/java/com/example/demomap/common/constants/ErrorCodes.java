package com.example.demomap.common.constants;

import com.apus.base.response.ErrorCode;

public final class ErrorCodes {
  public static final ErrorCode ATTRIBUTE_VALUE_VALIDATE_VALUE = new ErrorCode(1001, "error.productAttributeValueNameAlreadyExists");
  public static final ErrorCode ANSWER_NOT_FOUND = new ErrorCode(1002, "error.answerNotFound");
  public static final ErrorCode QUESTION_NOT_FOUND = new ErrorCode(1003, "error.answerNotFound");
  public static final ErrorCode ANSWER_NAME_EXISTS = new ErrorCode(1004, "error.answerNameAlreadyExists");
  public static final ErrorCode QUESTION_FK_CONSTRAINT = new ErrorCode(1005, "error.questionFkConstraint");
  public static final ErrorCode CODE_IS_EXISTS = new ErrorCode(1006, "error.codeIsExists");
  public static final ErrorCode NAME_IS_EXISTS = new ErrorCode(1007, "error.nameIsExists");
  public static final ErrorCode PRODUCT_PRICE_TEMPLATE_CANNOT_BE_EMPTY
          = new ErrorCode(1001, "error.productPriceTemplateCannotBeEmpty");
  public static final ErrorCode PRODUCTION_EXPENSE_TEMPLATE_CANNOT_BE_EMPTY
          = new ErrorCode(1001, "error.productionExpenseTemplateCannotBeEmpty");
  public static final ErrorCode PRODUCT_PRICE_TEMPLATE_CANNOT_BE_EXCEED
          = new ErrorCode(1001, "error.productPriceTemplateCannotBeExceed");
  public static final ErrorCode PRODUCTION_EXPENSE_TEMPLATE_CANNOT_BE_EXCEED
          = new ErrorCode(1001, "error.productionExpenseTemplateCannotBeExceed");

  public static final ErrorCode TEMPLATE_CANNOT_INACTIVE_BECAUSE_PRODUCT_IS_ACTIVE
          = new ErrorCode(1001, "error.templateCannotInActiveBecauseProductIsActive");

  public static final ErrorCode PRODUCT_PRICE_PRODUCT_CANNOT_BE_EXCEED
          = new ErrorCode(1001, "error.productPriceProductCannotBeExceed");

  public static final ErrorCode PRODUCTION_EXPENSE_PRODUCT_CANNOT_BE_EXCEED
          = new ErrorCode(1001, "error.productionExpenseProductCannotBeExceed");

  public static final ErrorCode TEMPLATE_IS_USING_WITH_PRICE
          =new ErrorCode(1001, "error.templateIsUsingWithPrice");
  public static final ErrorCode PRODUCT_IS_USING_WITH_PRICE
          =new ErrorCode(1001, "error.productIsUsingWithPrice");

  public static final ErrorCode PRODUCT_IS_ACTIVE = new ErrorCode(1001, "error.productIsActive");

  public static final ErrorCode PRODUCT_IS_ACTIVE_CANNOT_DELETE
          = new ErrorCode(1001, "error.productIsActiveCannotDelete");

  public static final ErrorCode CODE_INCORRECT_FORMAT = new ErrorCode(1008, "error.codeIncorrectFormat");
  public static final ErrorCode TEMPLATE_SKU_CANNOT_EXCEED = new ErrorCode(1001, "error.skuTemplateCannotExceed");
  public static final ErrorCode TEMPLATE_SKU_WRONG_FORMAT = new ErrorCode(1001, "error.skuTemplateWrongFormat");
  public static final ErrorCode TEMPLATE_UPC_CANNOT_EXCEED = new ErrorCode(1001,"error.upcTemplateCannotExceed");
  public static final ErrorCode TEMPLATE_UPC_WRONG_FORMAT = new ErrorCode(1001, "error.upcTemplateWrongFormat");
  public static final ErrorCode TEMPLATE_NAME_CANNOT_EXCEED = new ErrorCode(1001, "error.templateNameCannotExceed");
  public static final ErrorCode PRODUCT_SKU_CANNOT_EXCEED = new ErrorCode(1001, "error.productSkuCannotExceed");
  public static final ErrorCode PRODUCT_SKU_WRONG_FORMAT = new ErrorCode(1001, "error.productSkuWrongFormat");
  public static final ErrorCode PRODUCT_UPC_CANNOT_EXCEED = new ErrorCode(1001, "error.productUpcCannotExceed");
  public static final ErrorCode PRODUCT_UPC_WRONG_FORMAT = new ErrorCode(1001, "error.productUpcWrongFormat");
  public static final ErrorCode PRODUCT_NAME_CANNOT_EXCEED = new ErrorCode(1001, "error.productNameCannotExceed");
  public static final ErrorCode TEMPLATE_CANNOT_BE_CHANGE = new ErrorCode(1001, "error.templateCannotBeChange");
  public static final ErrorCode ATTRIBUTE_CATEGORY_CANNOT_BE_EMPTY = new ErrorCode(1001, "error.attributeCategoryCannotBeEmpty");
  public static final ErrorCode PRODUCT_ATTRIBUTE_IS_USING = new ErrorCode(1001, "error.productAttributeIsUsing");
  public static final ErrorCode PRODUCT_ATTRIBUTE_CATEGORY_FK_CONSTRAINT = new ErrorCode(1009, "error.productAttributeCategoryFkConstraint");
  public static final ErrorCode PRODUCT_IS_USING_IN_PRICE_LIST_CONDITION
          = new ErrorCode(1001, "error.productIsUsingInPriceListCondition");
  public static final ErrorCode TAX_ID_CANNOT_BE_EMPTY = new ErrorCode(1001, "error.taxIdCannotBeEmpty");
  public static final ErrorCode PRODUCT_CATEGORY_FK_CONSTRAINT = new ErrorCode(1010, "error.productCategoryFkConstraint");
  public static final ErrorCode ATTRIBUTE_VALUE_CANNOT_EXCEED = new ErrorCode(1001, "error.attributeValueCannotExceed");
  public static final ErrorCode PRICE_VARIATION_IS_NOT_FOUND = new ErrorCode(1011, "error.priceVariationNotFound");

  public static final ErrorCode BARCODE_IS_NOT_BLANK = new ErrorCode(1012, "error.barcodeIsNotBlank");
  public static final ErrorCode PRODUCT_ATTRIBUTE_FK_CONSTRAINT = new ErrorCode(1013, "error.productAttributeFkConstraint");

  public static final ErrorCode PRODUCT_IS_NOT_FOUND = new ErrorCode(1014, "error.productNotFound");
  public static final ErrorCode END_DATE_MUST_AFTER_START_DATE = new ErrorCode(1015, "error.endDateMustAfterStartDate");

  public static final ErrorCode PRODUCT_ATTRIBUTE_NAME_EXIST = new ErrorCode(1016, "error.nameAlreadyExists");

  public static final ErrorCode PRODUCT_TEMPLATE_IS_USING_IN_PRODUCT_TEMPLATE = new ErrorCode(1017, "error.productTemplateUsingInProductTemplate");

  public static final ErrorCode ATTRIBUTE_VALUE_ALREADY_EXITS = new ErrorCode(2018, "error.attributeValueAlreadyExists");

  public static final ErrorCode PRICE_VARIANT_NAME_EXIST = new ErrorCode(1019, "error.priceVariantNameAlreadyExists");
  public static final ErrorCode PRICE_VARIANT_CODE_EXIST = new ErrorCode(1020, "error.priceVariantCodeAlreadyExists");

  public static final ErrorCode ATTRIBUTE_CATEGORY_ID_IS_NOT_EXISTS = new ErrorCode(1021, "error.attributeCategoryIdIsNotExists");
  public static final ErrorCode ATTRIBUTE_CATEGORY_IS_USING = new ErrorCode(1022, "error.attributeCategoryIsUsing");
  public static final ErrorCode BRAND_IS_ACTIVE = new ErrorCode(1023, "error.brandIsActiveDoNotDelete");
  public static final ErrorCode BRAND_IS_USING = new ErrorCode(1024, "error.brandIsUsing");
  public static final ErrorCode BRAND_IS_USING_CAN_NOT_CHANGE_ACTIVE = new ErrorCode(1025, "error.brandIsUsingCanNotChangeActiveStatus");

  public static final ErrorCode BRAND_ID_IS_NOT_EXISTS = new ErrorCode(1026, "error.brandIdIsNotExists");
  public static final ErrorCode PRICE_LIST_CONDITION_IS_NOT_EXISTS = new ErrorCode(1027, "error.priceListConditionIsNotExists");

  public static final ErrorCode PRODUCT_ATTRIBUTE_VALUE_IS_NOT_FOUND = new ErrorCode(1028, "error.productAttributeValueNotFound");

  public static final ErrorCode PRODUCT_TEMPLATE_ATTRIBUTE_IS_NOT_FOUND = new ErrorCode(1029, "error.productTemplateAttributeValueMapEntityNotFound");


  public static final ErrorCode PRODUCTS_ATTRIBUTE_VALUE_MAP_IS_NOT_FOUND = new ErrorCode(1030, "error.productAttributeValueMapEntityNotFound");
  public static final ErrorCode PRODUCT_TAG_NOT_EXIST = new ErrorCode(1031, "error.productTagNotExist");
  public static final ErrorCode PRODUCT_TAG_IS_ACTIVE_DO_NOT_DELETE = new ErrorCode(1032, "error.ProductTagIsActiveDoNotDelete");

  public static final ErrorCode PRODUCT_CATEGORY_NOT_FOUND = new ErrorCode(1033, "error.productCategoryNotFound");
  public static final ErrorCode PRODUCT_CATEGORY_IS_ACTIVE = new ErrorCode(1034, "error.productCategoryIsActive");
  public static final ErrorCode SUB_PRODUCT_CATEGORY_EXITS = new ErrorCode(1035, "error.subProductCategoryIsActive");
  public static final ErrorCode  CODE_SHOULD_NOT_BE_TOO_LONG = new ErrorCode(1035, "error.codeShouldNotBeTooLong");
  public static final ErrorCode PRODUCT_CATEGORY_USED_IN_PRICE_LIST = new ErrorCode(1035, "error.productCategoryUsedInPriceList");
  public static final ErrorCode PRODUCT_CATEGORY_USED_IN_PRODUCT = new ErrorCode(1035, "error.productCategoryUsedInProduct");
  public static final ErrorCode PRODUCT_CATEGORY_CANNOT_IMPLEMENTS = new ErrorCode(1036, "error.productCategoryCannotImplement");
  public static final ErrorCode PRICE_LIST_CATEGORY_IS_NOT_EXIST = new ErrorCode(1037, "error.PriceListCategoryIsNotExist");
  public static final ErrorCode DISTRIBUTOR_IS_ACTIVE_DO_NOT_DELETE = new ErrorCode(1038, "error.DistributorIsActiveDoNotDelete");
  public static final ErrorCode DISTRIBUTOR_NOT_EXIST = new ErrorCode(1039, "error.DistributorNotExist");
  public static final ErrorCode PRODUCT_TEMPLATE_IS_NOT_FOUND = new ErrorCode(1040, "error.productTemplateNotFound");

  public static final ErrorCode PRODUCT_TEMPLATE_INTERNAL_IS_NOT_FOUND = new ErrorCode(1041, "error.productTemplateInternalNotFound");

  public static final ErrorCode PRODUCT_TEMPLATE_EXTERNAL_IS_NOT_FOUND = new ErrorCode(1042, "error.productTemplateExternalNotFound");

  public static final ErrorCode PRODUCT_ATTRIBUTE_IS_NOT_FOUND = new ErrorCode(1043, "error.productAttributeIsNotFound");
  public static final ErrorCode PRODUCT_TAG_IS_USING_IN_PRODUCT_TEMPLATE_DO_NOT_DELETE = new ErrorCode(1044, "error.ProductTagIsUsingDoNotDelete");
  public static final ErrorCode PRODUCT_TAG_IS_USING_IN_PRODUCT_TEMPLATE_DO_NOT_CHANGE_STATUS = new ErrorCode(1045, "error.ProductTagIsUsingDoNotChangeStatus");

  public static final ErrorCode PRODUCT_TAG_IS_USING_IN_PRODUCT_DO_NOT_DELETE = new ErrorCode(1046, "error.ProductTagIsUsingInProductDoNotDelete");
  public static final ErrorCode PRODUCT_TAG_IS_USING_IN_PRODUCT_DO_NOT_CHANGE_STATUS = new ErrorCode(1047, "error.ProductTagIsUsingInProductDoNotChangeStatus");

  public static final ErrorCode PRODUCT_PRICE_LIST_CATEGORY_IS_USING_IN_PRICE_LIST_DO_NOT_DELETE = new ErrorCode(1048, "error.ProductPriceListCategoryIsUsingInPriceListDoNotDelete");
  public static final ErrorCode REQUIRED_JPG_PNG_GIF = new ErrorCode(1098, "error.mustBeJpgPngGif");

  public static final ErrorCode FILE_DOES_NOT_EXCEED_5M = new ErrorCode(1099, "error.fileDoesNotExceed5Mb");

  public static final ErrorCode FILE_IS_NOT_FOUND = new ErrorCode(1099, "error.fileIsNotFound");

  public static final ErrorCode PRODUCT_CATEGORY_NAME_EXIST = new ErrorCode(1049, "error.productCategoryNameExits");
  public static final ErrorCode PRODUCT_CATEGORY_ATTRIBUTE_CANNOT_BLANK = new ErrorCode(1050, "error.productCategoryAttributeCannotBlank");
  public static final ErrorCode PRODUCT_CATEGORY_VARIANT_CANNOT_BLANK = new ErrorCode(1051, "error.productCategoryVariantCannotBlank");
  public static final ErrorCode TAX_NOT_FOUND = new ErrorCode(1052, "error.taxNotFound");
  public static final ErrorCode TAX_IS_ACTIVE_DO_NOT_DELETE = new ErrorCode(1053, "error.taxIsActiveDoNotDelete");

  public static final ErrorCode PRODUCT_ATTRIBUTE_CODE_EXIST = new ErrorCode(1054, "error.productAttributeCodeExit");

  public static final ErrorCode PRODUCT_TEMPLATE_IS_ACTIVE_DO_NOT_DELETE = new ErrorCode(1055, "error.productTemplateIsActiveDoNotDelete");

  public static final ErrorCode PRICE_LIST_NOT_EXIST = new ErrorCode(1056,"error.priceListNotExist");
  public static final ErrorCode CAN_NOT_GO_DOWN_THE_LINE = new ErrorCode(1056,"error.canNotGoDownTheLine");
  public static final ErrorCode PRODUCT_TEMPLATE_IS_USING = new ErrorCode(1057,"error.productTemplateIsUsing");
  public static final ErrorCode PRODUCT_IS_USING = new ErrorCode(1058, "error.productIsUsing");
  public static final ErrorCode VENDOR_IS_USING = new ErrorCode(1059, "error.vendorIsUsing");
  public static final ErrorCode VENDOR_IS_USING_CAN_NOT_CHANGE_STATUS = new ErrorCode(1060, "error.vendorIsUsingCanNotChangeStatus");
  public static final ErrorCode DEFAULT_VENDOR_SKU_CAN_NOT_BLANK
          = new ErrorCode(1061, "error.defaultVendorSkuCanNotBlank");

  public static final ErrorCode BRAND_CAN_NOT_DUPLICATE
          = new ErrorCode(1062, "error.brandCanNotDuplicate");

  public static final ErrorCode VENDOR_SKU_CAN_NOT_BLANK =
          new ErrorCode(1063, "error.vendorSkuCanNotBlank");

  public static final ErrorCode UPC_IS_NOT_BLANK =
          new ErrorCode(1064,"error.upcIsNotBlank");

  public static final ErrorCode PRICE_LIST_CONDITION_NOT_FOUND =
          new ErrorCode(1065,"error.priceListConditionNotFound");

  public static final ErrorCode PRICE_LIST_CONDITION_TAX_NOT_FOUND =
          new ErrorCode(1066,"error.priceListConditionTaxNotFound");

  public static final ErrorCode UOM_CODE_NOT_NULL =
          new ErrorCode(1067,"ERR203");

  public static final ErrorCode CONDITION_TAX_NOT_EMPTY =
          new ErrorCode(1068,"error.conditionTaxNotEmpty");

  public static final ErrorCode TAX_NOT_NULL =
          new ErrorCode(1069,"error.taxValueNotNull");

  public static final ErrorCode TAX_VALUE_INCORRECT =
          new ErrorCode(1070,"error.taxValueIncorrect");

  public static final ErrorCode PERCENT_PRICE_ON_BASE_INCORRECT =
          new ErrorCode(1071,"error.percentPriceOnBaseIncorrect");


  public static final ErrorCode CODE_CATEGORY_EXISTS =
          new ErrorCode(1071,"error.productCategoryCodeExits");
  private ErrorCodes() {

  }
}
