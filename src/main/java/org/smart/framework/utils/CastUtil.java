package org.smart.framework.utils;

/**
 * 转换类型操作工具类
 */
public final class CastUtil {

    /**
     * 转换为String类型，默认值为空
     */
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    /**
     * 转换为String类型，可以设置默认值
     */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转换为Double，默认为0
     */
    public static Double castDouble(Object obj) {
        return castDouble(obj, 0);
    }

    /**
     * 转换为Double，可以指定默认值
     */
    public static Double castDouble(Object obj, double defaultValue) {
        double value = defaultValue;
        if (obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    /**
     * 转换为long类型，默认值为0
     */
    public static long castLong(Object obj) {
        return castLong(obj, 0);
    }

    /**
     * 转换为long类型，可以指定默认值
     */
    public static long castLong(Object obj, long defaultValue) {
        long value = defaultValue;
        if (obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    /**
     * 转换为Int 默认值为0
     */
    public static int castInt(Object obj) {
        return castInt(obj, 0);
    }

    /**
     * 转换为Int 可以设置默认值
     */
    public static int castInt(Object obj, int defaultValue) {
        int value = defaultValue;
        if (obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    /**
     * 转换为boolean，默认为false
     */
    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    /**
     * 转换为boolean，可以设置默认值
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean value = defaultValue;
        return obj != null ? Boolean.parseBoolean(castString(obj)) : value;

    }


}
