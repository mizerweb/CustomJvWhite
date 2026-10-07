package com.vk.push.core;

import defpackage.lq4;
import defpackage.x05;
import defpackage.xx6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/vk/push/core/DeviceIdRepository;", "", "", "getDeviceId", "(Llq4;)Ljava/lang/Object;", "getDeviceIdBlocking", "()Ljava/lang/String;", "Lxx6;", "Lcom/vk/push/core/DeviceIdRepository$DeviceIdError;", "getErrorsFlow", "()Lxx6;", "errorsFlow", "DeviceIdError", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface DeviceIdRepository {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vk/push/core/DeviceIdRepository$DeviceIdError;", "", "", "exception", "", "message", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "component1", "()Ljava/lang/Throwable;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/vk/push/core/DeviceIdRepository$DeviceIdError;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getException", "b", "Ljava/lang/String;", "getMessage", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class DeviceIdError {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Throwable exception;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String message;

        public DeviceIdError(Throwable th, String str) {
            this.exception = th;
            this.message = str;
        }

        public static /* synthetic */ DeviceIdError copy$default(DeviceIdError deviceIdError, Throwable th, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                th = deviceIdError.exception;
            }
            if ((i & 2) != 0) {
                str = deviceIdError.message;
            }
            return deviceIdError.copy(th, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final DeviceIdError copy(Throwable exception, String message) {
            return new DeviceIdError(exception, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceIdError)) {
                return false;
            }
            DeviceIdError deviceIdError = (DeviceIdError) other;
            return this.exception.equals(deviceIdError.exception) && this.message.equals(deviceIdError.message);
        }

        public final Throwable getException() {
            return this.exception;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.exception.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DeviceIdError(exception=");
            sb.append(this.exception);
            sb.append(", message=");
            return x05.i(sb, this.message, ')');
        }
    }

    Object getDeviceId(lq4 lq4Var);

    String getDeviceIdBlocking();

    xx6 getErrorsFlow();
}
