package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tl0 implements eb7 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final c q;
    public boolean r;
    public int s;

    public tl0(c cVar) {
        cVar.H();
        va7 va7Var = cVar.v;
        if (va7Var != null) {
            va7Var.h.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = cVar;
    }

    @Override // defpackage.eb7
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (c.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(nb7 nb7Var) {
        this.a.add(nb7Var);
        nb7Var.d = this.b;
        nb7Var.e = this.c;
        nb7Var.f = this.d;
        nb7Var.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (c.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                nb7 nb7Var = (nb7) arrayList.get(i2);
                a aVar = nb7Var.b;
                if (aVar != null) {
                    aVar.s += i;
                    if (c.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + nb7Var.b + " to " + nb7Var.b.s);
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.r) {
            ore.k("commit already called");
            return 0;
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new ve9());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z2 = this.g;
        c cVar = this.q;
        if (z2) {
            this.s = cVar.j.getAndIncrement();
        } else {
            this.s = -1;
        }
        cVar.y(this, z);
        return this.s;
    }

    public final void e(int i, a aVar, String str) {
        String str2 = aVar.Z;
        if (str2 != null) {
            lb7 lb7Var = mb7.a;
            mb7.b(new FragmentReuseViolation(aVar, str2));
            mb7.a(aVar).getClass();
        }
        Class<?> cls = aVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            qr7.q(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
            return;
        }
        if (str != null) {
            String str3 = aVar.z;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(aVar);
                sb.append(": was ");
                ore.k(qt4.q(sb, aVar.z, " now ", str));
                return;
            }
            aVar.z = str;
        }
        if (i != 0) {
            if (i == -1) {
                c.l("Can't add fragment ", aVar, " with tag ", str, " to container view with no id");
                return;
            }
            int i2 = aVar.x;
            if (i2 != 0 && i2 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(aVar);
                int i3 = aVar.x;
                sb2.append(": was ");
                sb2.append(i3);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            aVar.x = i;
            aVar.y = i;
        }
        b(new nb7(1, aVar));
        aVar.t = this.q;
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nb7 nb7Var = (nb7) arrayList.get(i);
            switch (nb7Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + nb7Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(nb7Var.b);
            if (z) {
                if (nb7Var.d != 0 || nb7Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(nb7Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(nb7Var.e));
                }
                if (nb7Var.f != 0 || nb7Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(nb7Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(nb7Var.g));
                }
            }
        }
    }

    public final void g(a aVar) {
        c cVar = aVar.t;
        if (cVar == null || cVar == this.q) {
            b(new nb7(3, aVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + aVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(np0.m);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
