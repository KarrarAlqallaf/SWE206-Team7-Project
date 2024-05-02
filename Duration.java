public enum Duration {
    AM_01_02("01:00am - 02:00am"),
    AM_02_03("02:00am - 03:00am"),
    AM_03_04("03:00am - 04:00am"),
    AM_04_05("04:00am - 05:00am"),
    AM_05_06("05:00am - 06:00am"),
    AM_06_07("06:00am - 07:00am"),
    AM_07_08("07:00am - 08:00am"),
    AM_08_09("08:00am - 09:00am"),
    AM_09_10("09:00am - 10:00am"),
    AM_10_11("10:00am - 11:00am"),
    AM_11_12("11:00am - 12:00pm"),
    PM_12_01("12:00pm - 01:00pm"),
    PM_01_02("01:00pm - 02:00pm"),
    PM_02_03("02:00pm - 03:00pm"),
    PM_03_04("03:00pm - 04:00pm"),
    PM_04_05("04:00pm - 05:00pm"),
    PM_05_06("05:00pm - 06:00pm"),
    PM_06_07("06:00pm - 07:00pm"),
    PM_07_08("07:00pm - 08:00pm"),
    PM_08_09("08:00pm - 09:00pm"),
    PM_09_10("09:00pm - 10:00pm"),
    PM_10_11("10:00pm - 11:00pm"),
    PM_11_12("11:00pm - 12:00am"),
    AM_12_01("12:00am - 01:00am");

    private final String value;

    Duration(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
