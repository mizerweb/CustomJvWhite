package defpackage;

import one.me.mediaeditor.PhotoEditScreen;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dvc implements c8c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dvc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.c8c
    public final void a(e8c e8cVar, float f, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PhotoEditScreen photoEditScreen = (PhotoEditScreen) obj;
                zv8[] zv8VarArr = PhotoEditScreen.s1;
                photoEditScreen.B1(f);
                if (z && !e8cVar.getThumbIsPressed() && photoEditScreen.getView() != null) {
                    photoEditScreen.y1().B(k11.a);
                    break;
                }
                break;
            case 1:
                ProfileReactionsSettingsScreen profileReactionsSettingsScreen = (ProfileReactionsSettingsScreen) obj;
                zv8[] zv8VarArr2 = ProfileReactionsSettingsScreen.p;
                if (z) {
                    jtd jtdVarP1 = profileReactionsSettingsScreen.p1();
                    int i2 = (int) f;
                    mjg mjgVar = jtdVarP1.n;
                    Object value = mjgVar.getValue();
                    la3 la3Var = value instanceof la3 ? (la3) value : null;
                    la3 la3VarA = la3Var != null ? la3.a(la3Var, false, i2, null, false, false, 253) : null;
                    mjgVar.setValue(la3VarA != null ? la3.a(la3VarA, false, 0, null, false, jtdVarP1.D(la3VarA), 223) : null);
                }
                break;
            default:
                cf7 cf7Var = (cf7) obj;
                if (z) {
                    cf7Var.invoke(Float.valueOf(f));
                }
                break;
        }
    }
}
