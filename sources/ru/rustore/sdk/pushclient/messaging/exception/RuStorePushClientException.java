package ru.rustore.sdk.pushclient.messaging.exception;

import kotlin.Metadata;
import ru.rustore.sdk.core.exception.RuStoreException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException;", "Lru/rustore/sdk/core/exception/RuStoreException;", "HostAppBackgroundWorkPermissionNotGranted", "HostAppNotInstalledException", "UnauthorizedException", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$HostAppBackgroundWorkPermissionNotGranted;", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$HostAppNotInstalledException;", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$UnauthorizedException;", "client_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class RuStorePushClientException extends RuStoreException {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$HostAppBackgroundWorkPermissionNotGranted;", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException;", "client_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class HostAppBackgroundWorkPermissionNotGranted extends RuStorePushClientException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$HostAppNotInstalledException;", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException;", "client_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class HostAppNotInstalledException extends RuStorePushClientException {
        public final boolean a;

        public HostAppNotInstalledException(String str) {
            super(str);
            this.a = true;
        }

        @Override // ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getA() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$UnauthorizedException;", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException;", "client_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UnauthorizedException extends RuStorePushClientException {
        public final boolean a;

        public UnauthorizedException(String str) {
            super(str);
            this.a = true;
        }

        @Override // ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getA() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean getA() {
        return false;
    }
}
