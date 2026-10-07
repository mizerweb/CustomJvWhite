package ru.ok.android.onelog;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
final class OneLogDiagnostics {
    private static final String COLLECTOR = "ok.mobile.apps.onelog.diag";
    private static final String CUSTOM_COLLECTOR = "collector";
    private static final String CUSTOM_ERROR_CLASS = "error_class";
    private static final String CUSTOM_ERROR_MESSAGE = "error_message";
    private static final String CUSTOM_FILE_PATH = "file_path";
    private static final String CUSTOM_FILE_SIZE = "file_size";
    private static final String CUSTOM_FIRST_BYTES = "first_bytes";
    private static final String CUSTOM_MAX_PART_SIZE = "max_part_size";
    private static final String OPERATION_APPEND_FAILED = "onelog_append_failed";
    private static final String OPERATION_CORRUPTED_FILE_DROPPED = "onelog_corrupted_file_dropped";
    private static final String OPERATION_FILE_TOO_LARGE_DROPPED = "onelog_file_too_large_dropped";
    private static final String OPERATION_SERIALIZATION_ERROR = "onelog_serialization_error";
    private static final ThreadLocal<Boolean> REPORTING_APPEND_FAILURE = new ThreadLocal<Boolean>() { // from class: ru.ok.android.onelog.OneLogDiagnostics.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };

    private OneLogDiagnostics() {
    }

    public static void reportAppendFailed(Throwable th, OneLogItem oneLogItem) {
        ThreadLocal<Boolean> threadLocal = REPORTING_APPEND_FAILURE;
        if (threadLocal.get().booleanValue()) {
            return;
        }
        threadLocal.set(Boolean.TRUE);
        try {
            OneLogItem.builder().setCollector(COLLECTOR).setOperation(OPERATION_APPEND_FAILED).setCustom("collector", oneLogItem.collector()).setCustom(CUSTOM_ERROR_CLASS, th.getClass().getName()).setCustom(CUSTOM_ERROR_MESSAGE, th.getMessage() != null ? th.getMessage() : "").setCount(1).build().log();
            threadLocal.set(Boolean.FALSE);
        } catch (Throwable unused) {
            REPORTING_APPEND_FAILURE.set(Boolean.FALSE);
        }
    }

    public static void reportCorruptedFileDropped(File file, String str, String str2) {
        try {
            OneLogItem.Builder custom = OneLogItem.builder().setCollector(COLLECTOR).setOperation(OPERATION_CORRUPTED_FILE_DROPPED).setCustom(CUSTOM_FILE_SIZE, String.valueOf(file.length())).setCustom(CUSTOM_FILE_PATH, file.getAbsolutePath());
            if (str2 == null) {
                str2 = "";
            }
            OneLogItem.Builder custom2 = custom.setCustom(CUSTOM_FIRST_BYTES, str2);
            if (str == null) {
                str = "";
            }
            custom2.setCustom("collector", str).setCount(1).build().log();
        } catch (Throwable unused) {
        }
    }

    public static void reportFileTooLargeDropped(File file, long j, String str) {
        try {
            OneLogItem.Builder custom = OneLogItem.builder().setCollector(COLLECTOR).setOperation(OPERATION_FILE_TOO_LARGE_DROPPED).setCustom(CUSTOM_FILE_SIZE, String.valueOf(file.length())).setCustom(CUSTOM_MAX_PART_SIZE, String.valueOf(j)).setCustom(CUSTOM_FILE_PATH, file.getAbsolutePath());
            if (str == null) {
                str = "";
            }
            custom.setCustom(CUSTOM_FIRST_BYTES, str).setCount(1).build().log();
        } catch (Throwable unused) {
        }
    }

    public static void reportSerializationError(File file, Throwable th) {
        try {
            String message = "";
            OneLogItem.Builder custom = OneLogItem.builder().setCollector(COLLECTOR).setOperation(OPERATION_SERIALIZATION_ERROR).setCustom(CUSTOM_FILE_SIZE, String.valueOf(file.length())).setCustom(CUSTOM_FILE_PATH, file.getAbsolutePath()).setCustom(CUSTOM_ERROR_CLASS, th != null ? th.getClass().getName() : "");
            if (th != null && th.getMessage() != null) {
                message = th.getMessage();
            }
            custom.setCustom(CUSTOM_ERROR_MESSAGE, message).setCount(1).build().log();
        } catch (Throwable unused) {
        }
    }
}
