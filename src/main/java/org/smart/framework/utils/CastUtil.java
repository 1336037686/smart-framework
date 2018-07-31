package org.smart.framework.utils;

/**
 * 转换类型操作工具类
 */
public final class CastUtil {

    /**
     * 转换为String类型，默认值为空
     * @param obj
     * @return
     */
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    /**
     * 转换为String类型，可以设置默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    private static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }





}
