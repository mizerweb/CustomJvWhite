package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f2 implements ksh {
    public Object a;
    public final Object b;

    public f2(int i) {
        this.b = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.b).add(new gu5());
        }
    }

    public static float f(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    @Override // defpackage.ksh
    /* JADX INFO: renamed from: b */
    public v44 a() {
        long jH = h() - ((Number) ((ifh) this.b).getValue()).longValue();
        ghb ghbVar = ew5.b;
        return new e2(jH, this, 0L);
    }

    public abstract void c();

    public abstract Object d(Context context, XmlResourceParser xmlResourceParser, int i);

    public Object e(Context context, XmlResourceParser xmlResourceParser) {
        Integer num = (Integer) n1g.h(xmlResourceParser).get(((rk) this.a).a);
        return num != null ? d(context, xmlResourceParser, num.intValue()) : this.b;
    }

    public abstract void g();

    public abstract long h();

    public abstract void i(hs0 hs0Var);

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public f2(lw5 lw5Var) {
        this.a = lw5Var;
        this.b = new ifh(new d2(0, this));
    }

    public /* synthetic */ f2() {
        this(new i94(12), new i94(12));
    }

    public /* synthetic */ f2(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
