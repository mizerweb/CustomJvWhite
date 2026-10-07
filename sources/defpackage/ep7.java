package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import one.me.sdk.vendor.sms.SmsRetrieverError;

/* JADX INFO: loaded from: classes3.dex */
public final class ep7 {
    public final Context a;
    public final pzf b;
    public final q8e c;
    public final dq4 d;
    public final String e;
    public dmk f;
    public int g;
    public kam h;

    public ep7(Context context, xhh xhhVar) {
        this.a = context;
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.b = pzfVarB;
        this.c = new q8e(pzfVarB);
        this.d = cqk.a(((n0c) xhhVar).c().S0());
        this.e = ep7.class.getName();
        ifh ifhVar = new ifh(new mp5(19, this));
        this.g = 6;
        try {
            np4.z(context, (dp7) ifhVar.getValue(), new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), "com.google.android.gms.auth.api.phone.permission.SEND", null, 2);
        } catch (Throwable th) {
            gm0.V(this.e, "SMS Retriever registration failed", new bp7(th));
        }
        b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(ep7 ep7Var, String str, nq4 nq4Var) {
        cp7 cp7Var;
        Serializable poeVar;
        String str2 = ep7Var.e;
        if (nq4Var instanceof cp7) {
            cp7Var = (cp7) nq4Var;
            int i = cp7Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                cp7Var.h = i - Integer.MIN_VALUE;
            } else {
                cp7Var = new cp7(ep7Var, nq4Var);
            }
        } else {
            cp7Var = new cp7(ep7Var, nq4Var);
        }
        Object obj = cp7Var.f;
        int i2 = cp7Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            try {
                Matcher matcher = Pattern.compile("[0-9]{" + ep7Var.g + "}").matcher(str);
                poeVar = matcher.find() ? matcher.group(0) : null;
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            if (!(poeVar instanceof poe)) {
                String str3 = (String) poeVar;
                if (str3 == null) {
                    gm0.X(str2, new SmsRetrieverError(zo5.i(ep7Var.g, "sms code matching failed: codeLength=", ", message=", str)), null, new Object[0]);
                } else {
                    pzf pzfVar = ep7Var.b;
                    cp7Var.d = str;
                    cp7Var.e = poeVar;
                    cp7Var.h = 1;
                    Object objEmit = pzfVar.emit(str3, cp7Var);
                    hu4 hu4Var = hu4.a;
                    if (objEmit == hu4Var) {
                        return hu4Var;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Serializable serializable = cp7Var.e;
            String str4 = cp7Var.d;
            ch3.d0(obj);
            poeVar = serializable;
            str = str4;
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.X(str2, new SmsRetrieverError(zo5.i(ep7Var.g, "sms code matching failed: codeLength=", ", message=", str), thA), null, new Object[0]);
        }
        return sbi.a;
    }

    public final void b() {
        kam kamVarB;
        if (this.h != null) {
            gm0.n(this.e, "task not null! skip start retriever");
            return;
        }
        kam kamVar = null;
        if (this.f == null) {
            this.f = new dmk(this.a, dmk.m, null, new a8g(14));
        }
        dmk dmkVar = this.f;
        if (dmkVar != null && (kamVarB = dmkVar.b(1, new xll())) != null) {
            oo6 oo6Var = new oo6(7, new nv4(17, this));
            c20 c20Var = vjh.a;
            kamVarB.e(c20Var, oo6Var);
            kamVarB.b(new ap7(this));
            kamVarB.k(new ap7(this));
            kamVarB.a(c20Var, new ap7(this));
            kamVar = kamVarB;
        }
        this.h = kamVar;
    }
}
