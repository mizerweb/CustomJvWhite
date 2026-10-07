package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class s11 extends mdh implements vf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s11(Object obj, Serializable serializable, lq4 lq4Var, int i) {
        super(4, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = serializable;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                s11 s11Var = new s11((w11) this.h, (lq4) obj4);
                s11Var.f = (hwg) obj;
                s11Var.g = (k7e) obj3;
                s11Var.invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                s11 s11Var2 = new s11(4, (lq4) obj4, 1);
                s11Var2.f = (ao1) obj;
                s11Var2.g = (jvh) obj2;
                s11Var2.h = (enc) obj3;
                return s11Var2.invokeSuspend(sbiVar);
            case 2:
                s11 s11Var3 = new s11(4, (lq4) obj4, 2);
                s11Var3.f = (n16) obj;
                s11Var3.g = (f16) obj2;
                s11Var3.h = (omh) obj3;
                return s11Var3.invokeSuspend(sbiVar);
            case 3:
                s11 s11Var4 = new s11(4, (lq4) obj4, 3);
                s11Var4.f = (List) obj;
                s11Var4.g = (List) obj2;
                s11Var4.h = (List) obj3;
                return s11Var4.invokeSuspend(sbiVar);
            case 4:
                ((Number) obj3).longValue();
                s11 s11Var5 = new s11((zgi) this.g, (AtomicReference) this.h, (lq4) obj4, 4);
                s11Var5.f = (Throwable) obj2;
                return s11Var5.invokeSuspend(sbiVar);
            default:
                ((Number) obj3).longValue();
                s11 s11Var6 = new s11((cii) this.g, (AtomicBoolean) this.h, (lq4) obj4, 5);
                s11Var6.f = (Throwable) obj2;
                return s11Var6.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2 = true;
        switch (this.e) {
            case 0:
                hwg hwgVar = (hwg) this.f;
                k7e k7eVar = (k7e) this.g;
                ch3.d0(obj);
                w11 w11Var = (w11) this.h;
                mjg mjgVar = w11Var.t;
                c79 c79VarW = yab.w();
                Integer num = hwgVar.a;
                c79VarW.add(w11.B(w11Var, "views_id", num != null ? num.intValue() : 0, R.drawable.icon_eye));
                if (k7eVar.c) {
                    Integer num2 = hwgVar.b;
                    c79VarW.add(w11.B(w11Var, "reactions_id", num2 != null ? num2.intValue() : 0, R.drawable.icon_heart));
                }
                mjgVar.setValue(yab.j(c79VarW));
                return sbi.a;
            case 1:
                ao1 ao1Var = (ao1) this.f;
                jvh jvhVar = (jvh) this.g;
                enc encVar = (enc) this.h;
                ch3.d0(obj);
                boolean z3 = ao1Var.h;
                pi6 pi6Var = ao1Var.f;
                boolean z4 = ao1Var.n;
                boolean z5 = z3 || (ao1Var.v && z4);
                boolean z6 = ao1Var.k.c;
                if ((pi6Var instanceof oi6) || (pi6Var instanceof ji6) || (pi6Var instanceof li6)) {
                    z = false;
                } else {
                    z = z3 ? true : z4;
                }
                return new svh(z3, z5, z6, z, ((pi6Var instanceof oi6) || (pi6Var instanceof ji6) || (pi6Var instanceof li6) || !z3) ? false : true, jvhVar, encVar.a.a.e(), encVar.a.a.isScreenCaptureEnabled());
            case 2:
                n16 n16Var = (n16) this.f;
                f16 f16Var = (f16) this.g;
                omh omhVar = (omh) this.h;
                ch3.d0(obj);
                return Boolean.valueOf((f16Var instanceof e16) && ((e16) f16Var).a.l == jb9.d && (n16Var instanceof k16) && !(omhVar instanceof nmh));
            case 3:
                List list = (List) this.f;
                List list2 = (List) this.g;
                List list3 = (List) this.h;
                ch3.d0(obj);
                qog qogVar = new qog();
                qogVar.a = list;
                qogVar.b = list2;
                qogVar.c = list3;
                return qogVar;
            case 4:
                Throwable th = (Throwable) this.f;
                ch3.d0(obj);
                if (th instanceof HttpUrlExpiredException) {
                    String str = ((zgi) this.g).c;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Got error about expired URL, retry upload", null);
                        }
                    }
                    ahi ahiVar = (ahi) ((AtomicReference) this.h).get();
                    mii miiVarH = ((zgi) this.g).h();
                    String str2 = ahiVar.d;
                    miiVarH.getClass();
                    miiVarH.f.a(new lqc(str2, p90.O(1, "url_expired"), miiVarH.a.a()));
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                je9 je9Var2 = je9.f;
                Throwable th2 = (Throwable) this.f;
                ch3.d0(obj);
                if (th2 instanceof f3i) {
                    f3i f3iVar = (f3i) th2;
                    zui zuiVar = f3iVar.a;
                    boolean z7 = zuiVar.h;
                    float f = zuiVar.f;
                    float f2 = zuiVar.g;
                    if (!z7 && yab.A(f, 0.0f) && yab.A(f2, 1.0f)) {
                        mii miiVar = (mii) ((cii) this.g).f.getValue();
                        String str3 = f3iVar.b;
                        miiVar.getClass();
                        miiVar.i(str3, new ylc("fail_convert", 1));
                        String str4 = ((cii) this.g).a;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str4, "Transcode within transload failed, falling back to a regular sequential transcode-upload", th2);
                        }
                        ((AtomicBoolean) this.h).set(false);
                    } else {
                        z2 = false;
                    }
                } else {
                    boolean z8 = th2 instanceof g3i;
                    cii ciiVar = (cii) this.g;
                    if (z8) {
                        String str5 = ciiVar.a;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                            a4cVar3.c(je9Var2, str5, "Transloader disabled in the middle of operation, retrying upload via a regular sequential transcode-upload pipeline", th2);
                        }
                        ((AtomicBoolean) this.h).set(false);
                    } else if (!(th2 instanceof TamErrorException) || !"invalid.token".equals(((TamErrorException) th2).a.b)) {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s11(w11 w11Var, lq4 lq4Var) {
        super(4, lq4Var);
        this.e = 0;
        this.h = w11Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s11(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }
}
