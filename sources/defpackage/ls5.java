package defpackage;

import com.vk.push.core.base.AidlException;

/* JADX INFO: loaded from: classes3.dex */
public enum ls5 implements lrc {
    CANT_CREATE_OUTPUT_FILE(101),
    MAX_INVALIDATE_COUNT(102),
    URL_EXPIRED_FOR_NON_AUDIO(AidlException.HOST_IS_NOT_MASTER),
    MESSAGE_DELETED(AidlException.SDK_IS_NOT_INITIALIZED),
    USER_CANCELLED(106),
    INTERRUPTED_UNKNOWN(107),
    NOT_ENOUGH_SPACE(108),
    BAD_RESPONSE(109),
    EMPTY_DATA_ON_COMPLETE(130),
    EMPTY_DOWNLOAD_DATA(131),
    ERROR_CREATING_REQUEST(300);

    public final int a;

    ls5(int i) {
        this.a = i;
    }

    @Override // defpackage.lrc
    public final int a() {
        return this.a;
    }
}
