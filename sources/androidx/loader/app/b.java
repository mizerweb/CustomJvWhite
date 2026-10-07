package androidx.loader.app;

import android.os.Looper;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import defpackage.b8j;
import defpackage.ba9;
import defpackage.ca9;
import defpackage.g19;
import defpackage.h8j;
import defpackage.i8j;
import defpackage.keg;
import defpackage.khb;
import defpackage.ks9;
import defpackage.np0;
import defpackage.ore;
import defpackage.rxk;
import defpackage.sr3;
import defpackage.ukk;
import defpackage.uql;
import defpackage.x7b;
import defpackage.zfe;
import defpackage.zv4;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public final g19 a;
    public final LoaderManagerImpl$LoaderViewModel b;

    public b(g19 g19Var, h8j h8jVar) {
        b8j b8jVarA;
        this.a = g19Var;
        LinkedHashMap linkedHashMap = h8jVar.a;
        zv4 zv4Var = zv4.c;
        sr3 sr3VarA = zfe.a(LoaderManagerImpl$LoaderViewModel.class);
        String strG = sr3VarA.g();
        if (strG == null) {
            ore.p("Local and anonymous classes can not be ViewModels");
            throw null;
        }
        String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG);
        b8j b8jVar = (b8j) linkedHashMap.get(strConcat);
        boolean zI = sr3VarA.i(b8jVar);
        a aVar = LoaderManagerImpl$LoaderViewModel.d;
        if (!zI) {
            x7b x7bVar = new x7b(zv4Var);
            x7bVar.o(khb.n, strConcat);
            try {
                try {
                    b8jVarA = aVar.c(sr3VarA, x7bVar);
                } catch (AbstractMethodError unused) {
                    b8jVarA = aVar.a(sr3VarA.d());
                }
            } catch (AbstractMethodError unused2) {
                b8jVarA = aVar.b(sr3VarA.d(), x7bVar);
            }
            b8jVar = b8jVarA;
            b8j b8jVar2 = (b8j) linkedHashMap.put(strConcat, b8jVar);
            if (b8jVar2 != null) {
                b8jVar2.a();
            }
        }
        this.b = (LoaderManagerImpl$LoaderViewModel) b8jVar;
    }

    public static b b(g19 g19Var) {
        return new b(g19Var, ((i8j) g19Var).b());
    }

    public final void a(String str, PrintWriter printWriter) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.b.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String strConcat = str.concat("    ");
        int i = 0;
        while (true) {
            keg kegVar = loaderManagerImpl$LoaderViewModel.b;
            if (i >= kegVar.c) {
                return;
            }
            ba9 ba9Var = (ba9) kegVar.c(i);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(loaderManagerImpl$LoaderViewModel.b.a[i]);
            printWriter.print(": ");
            printWriter.println(ba9Var.toString());
            printWriter.print(strConcat);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(strConcat);
            printWriter.print("mLoader=");
            printWriter.println(ba9Var.l);
            rxk rxkVar = ba9Var.l;
            String strConcat2 = strConcat.concat("  ");
            rxkVar.getClass();
            printWriter.print(strConcat2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(rxkVar.a);
            if (rxkVar.b || rxkVar.e) {
                printWriter.print(strConcat2);
                printWriter.print("mStarted=");
                printWriter.print(rxkVar.b);
                printWriter.print(" mContentChanged=");
                printWriter.print(rxkVar.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (rxkVar.c || rxkVar.d) {
                printWriter.print(strConcat2);
                printWriter.print("mAbandoned=");
                printWriter.print(rxkVar.c);
                printWriter.print(" mReset=");
                printWriter.println(rxkVar.d);
            }
            if (rxkVar.g != null) {
                printWriter.print(strConcat2);
                printWriter.print("mTask=");
                printWriter.print(rxkVar.g);
                printWriter.print(" waiting=");
                rxkVar.g.getClass();
                printWriter.println(false);
            }
            if (rxkVar.h != null) {
                printWriter.print(strConcat2);
                printWriter.print("mCancellingTask=");
                printWriter.print(rxkVar.h);
                printWriter.print(" waiting=");
                rxkVar.h.getClass();
                printWriter.println(false);
            }
            if (ba9Var.n != null) {
                printWriter.print(strConcat);
                printWriter.print("mCallbacks=");
                printWriter.println(ba9Var.n);
                ca9 ca9Var = ba9Var.n;
                String strConcat3 = strConcat.concat("  ");
                ca9Var.getClass();
                printWriter.print(strConcat3);
                printWriter.print("mDeliveredData=");
                printWriter.println(ca9Var.b);
            }
            printWriter.print(strConcat);
            printWriter.print("mData=");
            rxk rxkVar2 = ba9Var.l;
            Object objD = ba9Var.d();
            rxkVar2.getClass();
            StringBuilder sb = new StringBuilder(64);
            uql.a(sb, objD);
            sb.append("}");
            printWriter.println(sb.toString());
            printWriter.print(strConcat);
            printWriter.print("mStarted=");
            printWriter.println(ba9Var.c > 0);
            i++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final rxk c(ks9 ks9Var) {
        g19 g19Var = this.a;
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.c) {
            ore.k("Called while creating a loader");
            return null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ore.k("initLoader must be called on the main thread");
            return null;
        }
        ba9 ba9Var = (ba9) loaderManagerImpl$LoaderViewModel.b.a(0);
        if (ba9Var != null) {
            rxk rxkVar = ba9Var.l;
            ca9 ca9Var = new ca9(rxkVar, ks9Var);
            ba9Var.e(g19Var, ca9Var);
            ca9 ca9Var2 = ba9Var.n;
            if (ca9Var2 != null) {
                ba9Var.j(ca9Var2);
            }
            ba9Var.m = g19Var;
            ba9Var.n = ca9Var;
            return rxkVar;
        }
        try {
            loaderManagerImpl$LoaderViewModel.c = true;
            SignInHubActivity signInHubActivity = (SignInHubActivity) ks9Var.b;
            Set set = ukk.b;
            synchronized (set) {
            }
            rxk rxkVar2 = new rxk(signInHubActivity, set);
            if (rxk.class.isMemberClass() && !Modifier.isStatic(rxk.class.getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + rxkVar2);
            }
            ba9 ba9Var2 = new ba9(rxkVar2);
            loaderManagerImpl$LoaderViewModel.b.b(0, ba9Var2);
            loaderManagerImpl$LoaderViewModel.c = false;
            rxk rxkVar3 = ba9Var2.l;
            ca9 ca9Var3 = new ca9(rxkVar3, ks9Var);
            ba9Var2.e(g19Var, ca9Var3);
            ca9 ca9Var4 = ba9Var2.n;
            if (ca9Var4 != null) {
                ba9Var2.j(ca9Var4);
            }
            ba9Var2.m = g19Var;
            ba9Var2.n = ca9Var3;
            return rxkVar3;
        } catch (Throwable th) {
            loaderManagerImpl$LoaderViewModel.c = false;
            throw th;
        }
    }

    public final void d() {
        keg kegVar = this.b.b;
        int i = kegVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ba9) kegVar.c(i2)).l();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(np0.m);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        uql.a(sb, this.a);
        sb.append("}}");
        return sb.toString();
    }
}
