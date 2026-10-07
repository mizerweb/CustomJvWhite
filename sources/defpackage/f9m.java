package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class f9m extends qkk {
    public final RevocationBoundService d;

    public f9m(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 5);
        this.d = revocationBoundService;
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
    @Override // defpackage.qkk
    public final boolean m0(int i, Parcel parcel, Parcel parcel2) throws JSONException {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strD;
        RevocationBoundService revocationBoundService = this.d;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            n0();
            i1m.b0(revocationBoundService).Y();
            return true;
        }
        n0();
        fqg fqgVarA = fqg.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = fqgVarA.b();
        GoogleSignInOptions googleSignInOptionsB = GoogleSignInOptions.k;
        if (googleSignInAccountB != null) {
            String strD2 = fqgVarA.d("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strD2) || (strD = fqgVarA.d(fqg.f("googleSignInOptions", strD2))) == null) {
                googleSignInOptionsB = null;
            } else {
                try {
                    googleSignInOptionsB = GoogleSignInOptions.b(strD);
                } catch (JSONException unused) {
                    googleSignInOptionsB = null;
                }
            }
        }
        yab.s(googleSignInOptionsB);
        dmk dmkVar = new dmk(revocationBoundService, l51.a, googleSignInOptionsB, new a8g(14));
        Context context = dmkVar.a;
        ukk ukkVar = dmkVar.h;
        if (googleSignInAccountB != null) {
            boolean z = dmkVar.d() == 3;
            ed7 ed7Var = nfl.a;
            if (ed7Var.b <= 3) {
                Log.d((String) ed7Var.c, ((String) ed7Var.d).concat("Revoking access"));
            }
            String strD3 = fqg.a(context).d("refreshToken");
            nfl.a(context);
            if (!z) {
                til tilVar = new til(ukkVar, 1);
                ukkVar.a(tilVar);
                basePendingResult2 = tilVar;
            } else if (strD3 == null) {
                ed7 ed7Var2 = v1l.c;
                Status status = new Status(4, null, null, null);
                yab.n("Status code must not be SUCCESS", !status.b());
                olk olkVar = new olk(status);
                olkVar.e(status);
                basePendingResult2 = olkVar;
            } else {
                v1l v1lVar = new v1l(strD3);
                new Thread(v1lVar).start();
                basePendingResult2 = v1lVar.b;
            }
            basePendingResult2.a(new nkk(basePendingResult2, new qjh(), new lu8()));
        } else {
            boolean z2 = dmkVar.d() == 3;
            ed7 ed7Var3 = nfl.a;
            if (ed7Var3.b <= 3) {
                Log.d((String) ed7Var3.c, ((String) ed7Var3.d).concat("Signing out"));
            }
            nfl.a(context);
            if (z2) {
                wkg wkgVar = new wkg(ukkVar);
                wkgVar.e(Status.e);
                basePendingResult = wkgVar;
            } else {
                til tilVar2 = new til(ukkVar, 0);
                ukkVar.a(tilVar2);
                basePendingResult = tilVar2;
            }
            basePendingResult.a(new nkk(basePendingResult, new qjh(), new lu8()));
        }
        return true;
    }

    public final void n0() {
        int callingUid = Binder.getCallingUid();
        RevocationBoundService revocationBoundService = this.d;
        jv4 jv4VarA = q0k.a(revocationBoundService);
        jv4VarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) jv4VarA.a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            try {
                PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                zo7 zo7VarI = zo7.i(revocationBoundService);
                zo7VarI.getClass();
                if (packageInfo != null) {
                    if (zo7.w(packageInfo, false)) {
                        return;
                    }
                    if (zo7.w(packageInfo, true)) {
                        Context context = (Context) zo7VarI.b;
                        try {
                            if (!xo7.c) {
                                PackageInfo packageInfo2 = q0k.a(context).a.getPackageManager().getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                zo7.i(context);
                                if (packageInfo2 == null || zo7.w(packageInfo2, false) || !zo7.w(packageInfo2, true)) {
                                    xo7.b = false;
                                } else {
                                    xo7.b = true;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                        } finally {
                            xo7.c = true;
                        }
                        if (xo7.b || !"user".equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
            int callingUid2 = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid2);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        } catch (SecurityException unused2) {
        }
    }
}
