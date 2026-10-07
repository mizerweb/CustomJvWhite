package defpackage;

import android.content.SharedPreferences;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j55 implements j8e {
    public static final Object e = new Object();
    public final Object a;
    public final Object b;
    public final Object c;
    public volatile Object d;

    public j55(ifh ifhVar) {
        this.a = ifhVar;
        pzf pzfVarB = e9i.b(0, 1, 1);
        this.b = pzfVarB;
        this.c = new q8e(pzfVarB);
    }

    public ahb a() {
        ahb ahbVar = (ahb) this.d;
        if (ahbVar != null) {
            return ahbVar;
        }
        j85 j85Var = ahb.a;
        String string = ((SharedPreferences) ((ifh) this.a).getValue()).getString("nightmode", "");
        if (string == null) {
            ore.p("Required value was null.");
            return null;
        }
        j85Var.getClass();
        ahb ygbVar = zgb.b;
        List listL1 = r5h.l1(string, new char[]{','});
        if (!listL1.isEmpty()) {
            String str = (String) ww3.r1(listL1);
            switch (str.hashCode()) {
                case -1609594047:
                    if (str.equals("enabled")) {
                        ygbVar = xgb.b;
                    }
                    break;
                case -887328209:
                    str.equals("system");
                    break;
                case -697920873:
                    if (str.equals("schedule")) {
                        ghb ghbVar = ew5.b;
                        int i = Integer.parseInt((String) listL1.get(1));
                        lw5 lw5Var = lw5.MINUTES;
                        ygbVar = new ygb(qe7.O(i, lw5Var), qe7.O(Integer.parseInt((String) listL1.get(2)), lw5Var));
                    }
                    break;
                case 270940796:
                    if (str.equals("disabled")) {
                        ygbVar = wgb.b;
                    }
                    break;
            }
        }
        this.d = ygbVar;
        return ygbVar;
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        Method declaredMethod;
        if (this.d == e) {
            try {
                Class cls = (Class) ((af7) this.a).invoke();
                String str = (String) this.b;
                Class[] clsArr = (Class[]) this.c;
                declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
                declaredMethod = null;
            }
            this.d = declaredMethod;
        }
        return (Method) this.d;
    }

    public j55(af7 af7Var, String str, Class... clsArr) {
        this.a = af7Var;
        this.b = str;
        this.c = clsArr;
        this.d = e;
    }

    public /* synthetic */ j55(fj3 fj3Var, String str) {
        this(fj3Var, str, new Class[0]);
    }
}
