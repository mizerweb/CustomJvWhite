package defpackage;

import com.vk.push.core.base.AidlException;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
public enum lii implements lrc {
    UNKNOWN_ATTACH(100),
    ATTACH_OR_MSG_DELETED(101),
    USER_CANCELLED(102),
    FILE_NOT_EXISTS(AidlException.HOST_IS_NOT_MASTER),
    MESSAGE_OR_ATTACH_DELETED_ON_START(AidlException.SDK_IS_NOT_INITIALIZED),
    ERROR_DURING_CONVERT(200),
    CONVERTED_FILE_DISAPPEARED(201),
    SOURCE_FILE_CHANGED(300),
    URI_PARAMS_NULL(301),
    URI_PARAMS_EMPTY(HttpStatus.SC_MOVED_TEMPORARILY),
    UPLOAD_URL_RETRIEVE(HttpStatus.SC_SEE_OTHER),
    CRITICAL_ERROR(HttpStatus.SC_NOT_MODIFIED),
    URI_PARAMS_COPY_ERROR(HttpStatus.SC_USE_PROXY),
    CONVERT_TO_JPEG_ERROR(306),
    UPLOAD_INVALID_RESULT_STATE(HttpStatus.SC_TEMPORARY_REDIRECT),
    UPLOAD_FILE_EMPTY(308),
    UPLOAD_TIMEOUT(309),
    UPLOAD_MAX_RETRY_COUNT(310),
    UPLOAD_UNKNOWN_ERROR(311),
    DEGRADATION_BLOCKED(312);

    public final int a;

    lii(int i) {
        this.a = i;
    }

    @Override // defpackage.lrc
    public final int a() {
        return this.a;
    }
}
