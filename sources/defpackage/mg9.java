package defpackage;

import com.vk.push.core.base.AidlException;

/* JADX INFO: loaded from: classes.dex */
public enum mg9 implements lrc {
    SOCKET_CLOSED(100),
    SOCKET_DNS_ERROR(101),
    SOCKET_CONNECT_ERROR(102),
    SOCKET_TIMEOUT(AidlException.HOST_IS_NOT_MASTER),
    SOCKET_IO_ERROR(AidlException.SDK_IS_NOT_INITIALIZED),
    SESSION_STATE_ERROR(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION),
    USER_LOGOUT(106),
    SESSION_FORCE_UPDATE(110),
    SESSION_RESTART(111),
    /* JADX INFO: Fake field, exist only in values array */
    LOGIN_DROP_CACHE(120),
    LOGIN_BACK_BLOCKED(121),
    LOGIN_RESTART(122),
    LOGIN_UNKNOWN(123),
    LOGIN_WORK_UNKNOWN(124);

    public final int a;

    mg9(int i) {
        this.a = i;
    }

    @Override // defpackage.lrc
    public final int a() {
        return this.a;
    }
}
