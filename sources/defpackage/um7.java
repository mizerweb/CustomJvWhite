package defpackage;

import one.me.mediaeditor.GifViewerWidget;
import one.me.mediaeditor.VideoViewerWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class um7 implements c3j {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3j b;
    public final /* synthetic */ Object c;

    public /* synthetic */ um7(Object obj, e3j e3jVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = e3jVar;
    }

    @Override // defpackage.c3j
    public final void g() {
        int i = this.a;
        e3j e3jVar = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                uj6 uj6Var = ((GifViewerWidget) obj).i;
                if (uj6Var != null) {
                    uj6Var.g();
                }
                e3jVar.q(this);
                break;
            case 1:
                uj6 uj6Var2 = ((one.me.chatmedia.viewer.photo.GifViewerWidget) obj).j;
                if (uj6Var2 != null) {
                    uj6Var2.g();
                }
                e3jVar.q(this);
                break;
            case 2:
                ((z5j) obj).s(true);
                e3jVar.q(this);
                break;
            case 3:
                zv8[] zv8VarArr = VideoViewerWidget.o;
                uj6 uj6Var3 = ((VideoViewerWidget) obj).d;
                if (uj6Var3 != null) {
                    uj6Var3.g();
                }
                e3jVar.q(this);
                break;
            default:
                zv8[] zv8VarArr2 = one.me.stories.edit.VideoViewerWidget.o;
                uj6 uj6Var4 = ((one.me.stories.edit.VideoViewerWidget) obj).d;
                if (uj6Var4 != null) {
                    uj6Var4.g();
                }
                e3jVar.q(this);
                break;
        }
    }
}
