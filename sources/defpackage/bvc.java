package defpackage;

import android.view.View;
import one.me.mediaeditor.PhotoEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bvc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoEditScreen b;

    public /* synthetic */ bvc(PhotoEditScreen photoEditScreen, int i) {
        this.a = i;
        this.b = photoEditScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        PhotoEditScreen photoEditScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PhotoEditScreen.s1;
                photoEditScreen.y1().B(k11.a);
                break;
            case 1:
                zv8[] zv8VarArr2 = PhotoEditScreen.s1;
                pw pwVar = photoEditScreen.g;
                pwVar.getClass();
                hw hwVar = new hw(pwVar);
                while (hwVar.hasNext()) {
                    qvc qvcVar = (qvc) hwVar.next();
                    zv8[] zv8VarArr3 = PhotoEditScreen.s1;
                    if (qvcVar != null) {
                        a8j.x(((lvc) qvcVar.c.b).n, wuc.b);
                    }
                }
                break;
            default:
                zv8[] zv8VarArr4 = PhotoEditScreen.s1;
                pw pwVar2 = photoEditScreen.g;
                pwVar2.getClass();
                hw hwVar2 = new hw(pwVar2);
                while (hwVar2.hasNext()) {
                    qvc qvcVar2 = (qvc) hwVar2.next();
                    zv8[] zv8VarArr5 = PhotoEditScreen.s1;
                    if (qvcVar2 != null) {
                        a8j.x(((lvc) qvcVar2.c.b).n, xuc.b);
                    }
                }
                break;
        }
    }
}
