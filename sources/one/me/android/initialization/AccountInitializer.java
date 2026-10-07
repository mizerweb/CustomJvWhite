package one.me.android.initialization;

import android.os.SystemClock;
import defpackage.a2c;
import defpackage.a8g;
import defpackage.af7;
import defpackage.c0a;
import defpackage.c46;
import defpackage.dni;
import defpackage.e5d;
import defpackage.ew5;
import defpackage.f5d;
import defpackage.f6;
import defpackage.gm0;
import defpackage.gt3;
import defpackage.ha9;
import defpackage.ifh;
import defpackage.jt5;
import defpackage.lw5;
import defpackage.mk5;
import defpackage.ore;
import defpackage.pk5;
import defpackage.poe;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.qzb;
import defpackage.roe;
import defpackage.t5;
import defpackage.uab;
import defpackage.ww3;
import defpackage.x77;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.android.OneMeApplication;
import one.me.rlottie.RLottie;
import one.me.sdk.uikit.qr.QrCodeGenerator;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lone/me/android/initialization/AccountInitializer;", "", "Ljt5;", "dps", "Ljt5;", "a", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AccountInitializer {
    public final c46 a;
    public final ha9 b;
    private jt5 dps;
    public final ArrayList c = new ArrayList();
    public final String d = AccountInitializer.class.getName();
    public final ifh e = new ifh(new t5(this, 9));

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/android/initialization/AccountInitializer$a;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends IssueKeyException {
        public a(Throwable th) {
            super(2, "rx", null, th);
        }
    }

    public AccountInitializer(c46 c46Var, ha9 ha9Var) {
        this.a = c46Var;
        this.b = ha9Var;
    }

    public static void a(OneMeApplication oneMeApplication, final AccountInitializer accountInitializer) {
        if (((Boolean) ((f5d) accountInitializer.d().d()).a.h3.a(e5d.S6[217]).i()).booleanValue()) {
            jt5.a aVarA = new jt5.a().t(oneMeApplication).r("ply5hDvhupghrHVA5rqQD1ypiXAxbmE4A68ZzBa8ioc=").L(new dni() { // from class: g6
                @Override // defpackage.dni
                public final String getUserId() {
                    return String.valueOf(((s7f) ((et3) qt4.i(this.a, 85))).t());
                }
            }).y(new mk5() { // from class: h6
                @Override // defpackage.mk5
                public final String a() {
                    n3 n3Var = ((aue) ((zte) c0a.j(this.a, 91))).g;
                    zv8 zv8Var = aue.h[2];
                    return (String) ((m3) n3Var.g).f();
                }
            }).w(new gt3() { // from class: i6
                @Override // defpackage.gt3
                public final String a() {
                    this.a.d().b().getClass();
                    return "26.28.0";
                }
            }).A(a2c.f((a2c) qt4.i(accountInitializer, 27), "dps", 0, 2, true, true, 1, 2));
            pk5 pk5Var = (pk5) c0a.j(accountInitializer, 88);
            pk5Var.getClass();
            accountInitializer.dps = aVarA.I(pk5Var == pk5.HIGH).N(new f6(accountInitializer)).e();
        }
    }

    public static final void e(uab uabVar, AccountInitializer accountInitializer) {
        Object poeVar;
        lw5 lw5Var = lw5.MILLISECONDS;
        a8g a8gVar = QrCodeGenerator.b;
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary("qrcode");
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            a8gVar.getClass();
            gm0.n("QrCodeGenerator", "Native library (qrcode) was successfully loaded in " + jUptimeMillis2 + " ms");
            poeVar = new ew5(qe7.P(jUptimeMillis2, lw5Var));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof UnsatisfiedLinkError) {
                a8gVar.d("Failed to load native library qrcode (UnsatisfiedLinkError)", thA);
            } else {
                a8gVar.d("Unexpected error while loading qrcode", thA);
            }
        }
        if (!(poeVar instanceof poe)) {
            uabVar.a(ew5.s(((ew5) poeVar).a, lw5Var), "qrcode");
        }
        Object objM30initIoAF18A = RLottie.m30initIoAF18A((RLottie.Config) c0a.j(accountInitializer, 1113));
        if (objM30initIoAF18A instanceof poe) {
            return;
        }
        uabVar.a(ew5.s(((ew5) objM30initIoAF18A).a, lw5Var), "jlottie");
    }

    public final x77 b(c46 c46Var, String str, Iterable iterable, af7 af7Var) {
        ArrayList arrayList = this.c;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((x77) it.next()).a.equals(str)) {
                    ore.j(str, " is root", "Task ");
                    return null;
                }
            }
        }
        return c46Var.f(str, ww3.G1(iterable, arrayList), af7Var);
    }

    public final x77 c(c46 c46Var, String str, Iterable iterable, af7 af7Var) {
        x77 x77VarF = c46Var.f(str, iterable, af7Var);
        this.c.add(x77VarF);
        return x77VarF;
    }

    public final qzb d() {
        return (qzb) this.e.getValue();
    }
}
