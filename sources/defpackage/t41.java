package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.login.inputphone.InputPhoneScreen;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t41 implements s89, q5c, s72 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t41(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        Executor executor = (Executor) this.a;
        af7 af7Var = (af7) this.b;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        r72Var.a(new g89(atomicBoolean, 1), hm5.a);
        executor.execute(new h89(atomicBoolean, r72Var, af7Var, 1));
        return sbi.a;
    }

    @Override // defpackage.s89
    public void c(Object obj, cx6 cx6Var) {
        xf xfVar = (xf) obj;
        xfVar.s((l3d) this.b, new v2a(cx6Var, ((r75) this.a).e));
    }

    @Override // defpackage.q5c
    public String e(String str, String str2) {
        InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.a;
        r5c r5cVar = (r5c) this.b;
        zv8[] zv8VarArr = InputPhoneScreen.v;
        vtc vtcVar = (vtc) inputPhoneScreen.n.getValue();
        String code = r5cVar.getCode();
        int i = ((uu4) inputPhoneScreen.s1().t.a.getValue()).b;
        inputPhoneScreen.s1().d.getClass();
        return vd7.w(vtcVar, code, str2, str, i, (str.equals("GD") || str.equals("EG") || str.equals("CN")) ? false : true);
    }
}
