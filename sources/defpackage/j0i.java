package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.sdk.gl.effects.VideoMessageStencilHolder;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.video.calls.sdk.net.signaling.WSSignaling;
import one.video.transloader.TranscodingUploader;
import one.video.transloader.task.UploadTask;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j0i implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j0i(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                TranscodingUploader transcodingUploader = (TranscodingUploader) this.b;
                l3i l3iVar = (l3i) this.c;
                transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<get-activeTranscodeCount>");
                if (transcodingUploader.e < transcodingUploader.b.a) {
                    transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<get-activeTranscodeCount>");
                    int i = transcodingUploader.e + 1;
                    transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<set-activeTranscodeCount>");
                    transcodingUploader.e = i;
                    l3iVar.a();
                } else {
                    transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<get-transLoadQueue>");
                    transcodingUploader.f.add(l3iVar);
                }
                return sbi.a;
            case 1:
                TwoFACheckPassScreen twoFACheckPassScreen = (TwoFACheckPassScreen) this.b;
                Bundle bundle = (Bundle) this.c;
                k6i k6iVar = (k6i) twoFACheckPassScreen.a.getAccessor().c(393);
                mk8 mk8VarO1 = twoFACheckPassScreen.o1();
                String string = bundle.getString("twofa_check_password_track_id_key", "");
                pk8 pk8Var = (pk8) ((Parcelable) tre.f0(bundle, "twofa_check_password_nav_data_key", pk8.class));
                k6iVar.getClass();
                return new j6i(mk8VarO1, string, pk8Var, k6iVar.a, k6iVar.b, k6iVar.c, k6iVar.d, k6iVar.e, k6iVar.f);
            case 2:
                TwoFACreationScreen twoFACreationScreen = (TwoFACreationScreen) this.b;
                Bundle bundle2 = (Bundle) this.c;
                c7i c7iVar = (c7i) twoFACreationScreen.a.getAccessor().c(392);
                w6i w6iVarR1 = twoFACreationScreen.r1();
                v6i v6iVarP1 = twoFACreationScreen.p1();
                mk8 mk8Var = (mk8) twoFACreationScreen.e.getValue();
                String string2 = bundle2.getString("creation_2fa_track_id_key", "");
                pk8 pk8Var2 = (pk8) ((Parcelable) tre.f0(bundle2, "creation_2fa_nav_data_key", pk8.class));
                c7iVar.getClass();
                return new b7i(w6iVarR1, v6iVarP1, mk8Var, string2, pk8Var2, c7iVar.a, c7iVar.b, c7iVar.c, c7iVar.d, c7iVar.e);
            case 3:
                TwoFASettingsScreen twoFASettingsScreen = (TwoFASettingsScreen) this.b;
                Bundle bundle3 = (Bundle) this.c;
                l8i l8iVar = (l8i) twoFASettingsScreen.a.getAccessor().c(391);
                String string3 = bundle3.getString("twofa_settings_track_id_key", "");
                l8iVar.getClass();
                return new k8i(string3, l8iVar.a, l8iVar.b, l8iVar.c, l8iVar.d);
            case 4:
                TwoFAStartRestoreScreen twoFAStartRestoreScreen = (TwoFAStartRestoreScreen) this.b;
                Bundle bundle4 = (Bundle) this.c;
                q8i q8iVar = (q8i) twoFAStartRestoreScreen.a.getAccessor().c(395);
                String string4 = bundle4.getString("twofa_check_password_track_id_key", "");
                pk8 pk8Var3 = (pk8) ((Parcelable) tre.f0(bundle4, "twofa_check_password_nav_data_key", pk8.class));
                mk8 mk8Var2 = (mk8) twoFAStartRestoreScreen.c.getValue();
                q8iVar.getClass();
                return new p8i(string4, pk8Var3, mk8Var2, q8iVar.a, q8iVar.b, q8iVar.c);
            case 5:
                Context context = (Context) this.b;
                gci gciVar = (gci) this.c;
                ImageView imageView = new ImageView(context);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(44.0f * yl5.d().getDisplayMetrics().density), -2));
                gciVar.setGravity(17);
                imageView.setImageResource(R.drawable.icon_cross_round);
                n1g.N(new o23(3, null, 13), imageView);
                return imageView;
            case 6:
                UploadTask uploadTask = (UploadTask) this.b;
                dki dkiVar = (dki) this.c;
                sbi sbiVar = sbi.a;
                if (!uploadTask.b()) {
                    uploadTask.a.b("UploadTask", new lug(dkiVar.c(uploadTask.m, uploadTask.p), 1));
                }
                return sbiVar;
            case 7:
                UploadTask uploadTask2 = (UploadTask) this.b;
                iji ijiVar = (iji) this.c;
                return "Upload state update: " + uploadTask2.l + " -> " + ijiVar;
            case 8:
                return pyi.a((pyi) this.b, (Context) this.c);
            case 9:
                t0j t0jVar = (t0j) this.b;
                pni pniVar = (pni) this.c;
                h1j h1jVar = t0jVar.j;
                if (h1jVar != null) {
                    h1jVar.v = pniVar;
                }
                return sbi.a;
            case 10:
                cch cchVar = (cch) this.b;
                t0j t0jVar2 = (t0j) this.c;
                Surface surfaceG = cchVar.g(t0jVar2.e, new r0j(t0jVar2, cchVar));
                h1j h1jVar2 = t0jVar2.j;
                if (h1jVar2 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                h1jVar2.p(surfaceG);
                t0jVar2.g.put(cchVar, surfaceG);
                return sbi.a;
            case 11:
                t0j t0jVar3 = (t0j) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                h1j h1jVar3 = t0jVar3.j;
                if (h1jVar3 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                je9 je9Var = je9.d;
                String str = h1jVar3.o;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, c0a.o("setStencilBitmap, ", axl.b(bitmap), ", recycle_after_consume=true"), null);
                }
                xkg xkgVar = h1jVar3.p;
                if (xkgVar == null) {
                    xkgVar = new xkg(h1jVar3.n);
                    h1jVar3.p = xkgVar;
                }
                String str2 = (String) xkgVar.d;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, c0a.o("setBitmap, ", axl.b(bitmap), ", recycle_after_consume=true"), null);
                }
                ((VideoMessageStencilHolder) xkgVar.e).setStencilBitmap(bitmap, true);
                return sbi.a;
            case 12:
                meh mehVar = (meh) this.b;
                VideoWebViewScreen videoWebViewScreen = (VideoWebViewScreen) this.c;
                zv8[] zv8VarArr = VideoWebViewScreen.A;
                if (p90.E(mehVar)) {
                    FrameLayout frameLayoutL1 = videoWebViewScreen.L1();
                    ViewGroup.LayoutParams layoutParams = frameLayoutL1.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = 0;
                    marginLayoutParams.bottomMargin = 0;
                    frameLayoutL1.setLayoutParams(marginLayoutParams);
                } else {
                    FrameLayout frameLayoutL2 = videoWebViewScreen.L1();
                    ViewGroup.LayoutParams layoutParams2 = frameLayoutL2.getLayoutParams();
                    if (layoutParams2 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = videoWebViewScreen.I1().getHeight();
                    marginLayoutParams2.bottomMargin = videoWebViewScreen.H1().getHeight();
                    frameLayoutL2.setLayoutParams(marginLayoutParams2);
                }
                return Boolean.TRUE;
            case 13:
                return new v82((ny8) this.b, (njd) this.c, 1);
            case 14:
                ((wd4) ((ny8) this.b).getValue()).g((vd4) ((ifh) this.c).getValue());
                return sbi.a;
            case 15:
                return WSSignaling.sslSocketFactory_delegate$lambda$0((wxe) this.b, (WSSignaling) this.c);
            case 16:
                return WSSignaling.http_delegate$lambda$0((x5g) this.b, (WSSignaling) this.c);
            case 17:
                return new skj((tgb) ((ny8) this.b).getValue(), ((ioj) this.c).b);
            case 18:
                WebAppSettingsScreen webAppSettingsScreen = (WebAppSettingsScreen) this.b;
                Bundle bundle5 = (Bundle) this.c;
                ahj ahjVar = webAppSettingsScreen.b;
                long jT = ((s7f) ((et3) ahjVar.getAccessor().c(85))).t();
                dpj dpjVar = (dpj) ahjVar.getAccessor().c(1037);
                long j = bundle5.getLong("bot_id_arg");
                vv vvVar = webAppSettingsScreen.d;
                zv8 zv8Var = WebAppSettingsScreen.j[0];
                long jLongValue = ((Number) vvVar.a(webAppSettingsScreen)).longValue();
                StringBuilder sbS = qt4.s(jT, "webapp_biom_s_key_", "_");
                sbS.append(jLongValue);
                whj whjVar = new whj(sbS.toString(), true);
                dpjVar.getClass();
                return new cpj(j, whjVar, dpjVar.a, dpjVar.b, dpjVar.c, dpjVar.d, dpjVar.e, dpjVar.f);
            case 19:
                stj stjVar = (stj) this.b;
                return new ftj(stjVar.a, stjVar.b, stjVar.c, (gjf) this.c);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((Context) this.b).unregisterReceiver((cg) this.c);
                return sbi.a;
            default:
                return "Invalid sliceTime sorting in curr->" + ((yjk) this.b) + ", prev->" + ((yjk) this.c);
        }
    }
}
