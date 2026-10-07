package com.vk.push.core.deviceid.contentprovider;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import defpackage.ifh;
import defpackage.j95;
import defpackage.x9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/deviceid/contentprovider/DeviceIdUriMatcher;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lsbi;", "init", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "uri", "", "match", "(Landroid/net/Uri;)Z", "Companion", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceIdUriMatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final ifh a = new ifh(x9.c);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/vk/push/core/deviceid/contentprovider/DeviceIdUriMatcher$Companion;", "", "", "packageName", "getAuthority", "(Ljava/lang/String;)Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "", "getCode", "()I", "getVirtualColumnName", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public Companion(j95 j95Var) {
        }

        public final String getAuthority(String packageName) {
            return packageName.concat(".VkpnsDeviceIdContentProvider");
        }

        public final int getCode() {
            return 1;
        }

        public final String getPath() {
            return "deviceid";
        }

        public final String getVirtualColumnName() {
            return "device_id_column";
        }
    }

    public final void init(Context context) {
        UriMatcher uriMatcher = (UriMatcher) this.a.getValue();
        Companion companion = INSTANCE;
        uriMatcher.addURI(companion.getAuthority(context.getPackageName()), companion.getPath(), companion.getCode());
    }

    public final boolean match(Uri uri) {
        return ((UriMatcher) this.a.getValue()).match(uri) == INSTANCE.getCode();
    }
}
