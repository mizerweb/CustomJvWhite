package defpackage;

import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y42 implements tue, u8g, i8c {
    public final /* synthetic */ int a;
    public final /* synthetic */ af7 b;

    public /* synthetic */ y42(int i, af7 af7Var) {
        this.a = i;
        this.b = af7Var;
    }

    @Override // defpackage.tue
    public void a() {
        int i = this.a;
        af7 af7Var = this.b;
        switch (i) {
            case 0:
                af7Var.invoke();
                break;
            case 1:
                af7Var.invoke();
                break;
            default:
                af7Var.invoke();
                break;
        }
    }

    @Override // defpackage.u8g
    public void c(b8g b8gVar) {
        CallsThreadUtilsKt.executeOnIoThread$lambda$0(this.b, b8gVar);
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        af7 af7Var = this.b;
        if (af7Var != null) {
            af7Var.invoke();
        }
    }
}
