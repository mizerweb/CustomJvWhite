package defpackage;

import android.view.View;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gr9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPermissionWidget b;

    public /* synthetic */ gr9(MediaBarPermissionWidget mediaBarPermissionWidget, int i) {
        this.a = i;
        this.b = mediaBarPermissionWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = MediaBarPermissionWidget.g;
                mediaBarPermissionWidget.o1();
                break;
            case 1:
                zv8[] zv8VarArr2 = MediaBarPermissionWidget.g;
                mediaBarPermissionWidget.o1();
                break;
            default:
                zv8[] zv8VarArr3 = MediaBarPermissionWidget.g;
                mediaBarPermissionWidget.o1();
                break;
        }
    }
}
