package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class w70 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ x70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w70(x70 x70Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = x70Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        x70 x70Var = this.c;
        x70Var.h(u70.b((Context) x70Var.b, (p70) x70Var.j, (AudioDeviceInfo) x70Var.i));
    }
}
