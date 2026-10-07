package one.me.android.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import defpackage.a4c;
import defpackage.ar;
import defpackage.b1c;
import defpackage.c1c;
import defpackage.cy5;
import defpackage.d7c;
import defpackage.e9i;
import defpackage.fab;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hve;
import defpackage.je9;
import defpackage.lve;
import defpackage.oc9;
import defpackage.oo1;
import defpackage.p90;
import defpackage.po1;
import defpackage.tp2;
import defpackage.xvc;
import defpackage.z5h;
import defpackage.zo5;
import java.util.Set;
import one.me.android.MainActivity;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkInterceptorActivity extends ar {
    public final String y = LinkInterceptorActivity.class.getName();

    @Override // androidx.fragment.app.b, defpackage.g74, android.app.Activity
    public final void onCreate(Bundle bundle) {
        je9 je9Var = je9.d;
        String str = this.y;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "onCreate", null);
        }
        e9i.B0(getIntent());
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
            overrideActivityTransition(1, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        super.onCreate(bundle);
        if (t(getIntent())) {
            String str2 = this.y;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "onCreate: call intent handled", null);
                return;
            }
            return;
        }
        Uri data = getIntent().getData();
        String str3 = this.y;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str3, zo5.l(data, "before MyTracker.handleDeeplink uri: "), null);
        }
        fab fabVar = fab.a;
        String strA = fab.a(getIntent());
        String str4 = this.y;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            a4cVar4.c(je9Var, str4, "after MyTracker.handleDeeplink: " + ((Object) strA), null);
        }
        if (strA != null && strA.length() != 0) {
            Uri uri = Uri.parse(strA);
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames == null || queryParameterNames.isEmpty()) {
                gm0.Y(this.y, "don't need clear myTrackerLink");
            } else {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                builderBuildUpon.clearQuery();
                for (String str5 : queryParameterNames) {
                    if (!z5h.K0(str5, "mt_", false)) {
                        builderBuildUpon.appendQueryParameter(str5, uri.getQueryParameter(str5));
                    }
                }
                strA = builderBuildUpon.toString();
                String str6 = this.y;
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar5.b(je9Var2)) {
                        a4cVar5.c(je9Var2, str6, "after clear myTrackerLink: " + ((Object) strA), null);
                    }
                }
            }
        }
        if (data == null || strA == null || strA.length() == 0) {
            String str7 = this.y;
            a4c a4cVar6 = gm0.f;
            if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                a4cVar6.c(je9Var, str7, "onCreate: no uri/mtlink, fallback on MainActivity", null);
            }
            int i = MainActivity.o1;
            xvc.v(this, null, null, null, null, 30);
            finish();
            return;
        }
        tp2 tp2VarA = oc9.a(this);
        tp2VarA.setId(R.id.root);
        setContentView(tp2VarA);
        hve hveVarD = p90.d(this, tp2VarA, bundle);
        hveVarD.e = 1;
        hveVarD.S(true);
        if (!hveVarD.o()) {
            b1c b1cVarF = ((c1c) d7c.a.getAccessor().c(45)).f();
            lve lveVarE = oc9.e(new LinkInterceptorWidget(Uri.parse(strA), b1cVarF != null ? b1cVarF.b() : ha9.b, null, 4, null), null, null);
            lveVarE.e("link");
            hveVarD.T(lveVarE);
        }
        hveVarD.K();
    }

    @Override // defpackage.g74, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str = this.y;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onNewIntent", null);
            }
        }
        e9i.B0(intent);
        super.onNewIntent(intent);
        t(intent);
    }

    public final boolean t(Intent intent) {
        String action = intent.getAction();
        po1 po1VarL = action != null ? cy5.l(action) : null;
        if (po1VarL == null || (po1VarL instanceof oo1)) {
            return false;
        }
        if (!po1VarL.a()) {
            finish();
            return true;
        }
        int i = MainActivity.o1;
        Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
        intent2.setAction(intent.getAction());
        intent2.setData(intent.getData());
        startActivity(intent2);
        finish();
        return true;
    }
}
