package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.a;
import one.me.android.MainActivity;
import one.me.stories.edit.EditStoryScreen;
import one.video.calls.sdk.net.signaling.wt.nal.NAL;
import one.video.calls.sdk.net.signaling.wt.nal.NALHostnameVerifier;
import one.video.transloader.TranscodingUploader;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wre implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wre(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x033b  */
    @Override // defpackage.af7
    public final Object invoke() {
        Object u13Var;
        String strK;
        int length;
        final int i = 1;
        final int i2 = 0;
        switch (this.a) {
            case 0:
                ose oseVar = (ose) this.b;
                pw pwVar = (pw) this.c;
                f4a f4aVar = (f4a) this.d;
                toa toaVar = (toa) oseVar.h();
                toaVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM messages WHERE media_type in (");
                vd7.b(sb, pwVar.c);
                sb.append(") AND attaches IS NOT NULL AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL");
                for (gga ggaVar : (List) ch3.G(toaVar.a, true, false, new os1(sb.toString(), pwVar, toaVar, 12))) {
                    c46 c46Var = ggaVar.n;
                    f70 f70VarP = c46Var != null ? c46Var.p() : null;
                    if (f70VarP != null) {
                        f4aVar.accept(f70VarP);
                        long j = ggaVar.a;
                        c46 c46VarC = f70VarP.c();
                        toa toaVar2 = (toa) oseVar.h();
                        ((Number) ch3.G(toaVar2.a, false, true, new iaa(toaVar2, 10, new cei(j, c46VarC, pm9.a(c46VarC))))).intValue();
                    } else {
                        String str = "attaches are null but media type = " + pwVar;
                        gm0.V("RoomMessagesDatabase", str, new ase(null, str, 1, null));
                    }
                }
                return sbi.a;
            case 1:
                dl1 dl1Var = (dl1) this.b;
                List list = (List) this.c;
                nl5 nl5Var = (nl5) this.d;
                dl1Var.m = list;
                nl5Var.a(new t3a(dl1Var));
                return sbi.a;
            case 2:
                Context context = (Context) this.b;
                ha9 ha9Var = (ha9) this.c;
                ev1 ev1Var = (ev1) this.d;
                s52 s52Var = new s52(context, ha9Var);
                s52Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                s52Var.setMode(q52.PIP);
                s52Var.setVideoLayoutUpdatesControllerProvider(new br1(ev1Var));
                return s52Var;
            case 3:
                Context context2 = (Context) this.b;
                ha9 ha9Var2 = (ha9) this.c;
                bz1 bz1Var = (bz1) this.d;
                pd1 pd1Var = new pd1(context2, ha9Var2);
                pd1Var.setLayoutParams(new uf4(-1, 0));
                pd1Var.setVisibility(8);
                pd1Var.setClickListener(bz1Var.y);
                return pd1Var;
            case 4:
                return new pu1((ny8) this.b, ((h02) this.c).b, (ny8) this.d);
            case 5:
                Context context3 = (Context) this.b;
                ha9 ha9Var3 = (ha9) this.c;
                w22 w22Var = (w22) this.d;
                ev1 ev1Var2 = new ev1(context3, ha9Var3);
                ev1Var2.setPipTheme(pq3.j.l(ev1Var2).b);
                ev1Var2.setPipMode(bv1.b);
                ev1Var2.setId(View.generateViewId());
                ev1Var2.setListener(new xva(6, w22Var));
                ev1Var2.setVisibility(8);
                ev1Var2.setVideoLayoutUpdatesControllerProvider(new r22(w22Var, 0));
                return ev1Var2;
            case 6:
                u42 u42Var = (u42) this.b;
                fu1 fu1Var = (fu1) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                ya1 ya1Var = (ya1) u42Var.a();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    ya1Var.getClass();
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CallAdminSettingsController", "Removing user " + fu1Var + " from call", null);
                    }
                }
                Conversation conversationA = ya1Var.f().a();
                if (conversationA != null) {
                    conversationA.removeParticipant(anc.c(fu1Var), false);
                }
                pzf pzfVar = u42Var.f;
                py1 py1Var = ry1.b;
                pzfVar.a(new py1(4, new vnh(R.string.call_screen_admin_remove_user_title, a.n1(new Object[]{charSequence})), Integer.valueOf(R.drawable.icon_user_exclude_fill)));
                return sbi.a;
            case 7:
                return g52.u((Context) this.b, (ha9) this.c, (g52) this.d);
            case 8:
                Context context4 = (Context) this.b;
                ha9 ha9Var4 = (ha9) this.c;
                s52 s52Var2 = (s52) this.d;
                c62 c62Var = new c62(context4, ha9Var4);
                c62Var.setLayoutParams(new uf4(-1, -1));
                o7j.i(c62Var, false);
                c62Var.setListener(new ot4(18, s52Var2));
                c62Var.setVideoLayoutUpdatesControllerProvider(new l52(s52Var2, 1));
                return c62Var;
            case 9:
                du6 du6Var = (du6) this.b;
                ny8 ny8Var = (ny8) this.c;
                ny8 ny8Var2 = (ny8) this.d;
                int iOrdinal = ((mg5) du6Var.d).ordinal();
                if (iOrdinal == 0) {
                    u13Var = new u13(du6Var.a, du6Var.b, du6Var.c, (Set) du6Var.e, ny8Var);
                } else {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    u13Var = new s13(du6Var.a, (Set) du6Var.e, ny8Var, ny8Var2);
                }
                return u13Var;
            case 10:
                return q3m.b((String) this.b, (Rect) this.c, ((g5d) ((wf3) this.d).e).l());
            case 11:
                q3m.g(((File) this.b).getAbsolutePath(), (Bitmap) this.c, ((g5d) ((wf3) this.d).e).n(), Bitmap.CompressFormat.JPEG);
                return sbi.a;
            case 12:
                return ConversationFeatureCommandExecutorImpl.enableFeatureForRoles$lambda$0((ConversationFeatureCommandExecutorImpl) this.b, (oi1) this.c, (Set) this.d);
            case 13:
                return new ra8((y85) this.b, (ny8) this.c, (ny8) this.d);
            case 14:
                ae5 ae5Var = (ae5) this.b;
                wfe wfeVar = (wfe) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                File fileS = ((ju6) ((rs6) ae5Var.d.getValue())).s("preview_" + UUID.randomUUID(), "jpg");
                wfeVar.a = fileS;
                if (bitmap.isRecycled()) {
                    String str2 = ae5Var.f;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 == null) {
                        return null;
                    }
                    je9 je9Var2 = je9.f;
                    if (!a4cVar2.b(je9Var2)) {
                        return null;
                    }
                    a4cVar2.c(je9Var2, str2, "Video frame was recycled", null);
                    return null;
                }
                q3m.g(fileS.getAbsolutePath(), bitmap, 100, Bitmap.CompressFormat.JPEG);
                String str3 = ae5Var.f;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar3.b(je9Var3)) {
                        Object absolutePath = fileS.getAbsolutePath();
                        if (gm0.c()) {
                            strK = absolutePath.toString();
                        } else if (absolutePath instanceof Collection) {
                            Collection collection = (Collection) absolutePath;
                            if (collection.isEmpty()) {
                                strK = "[]";
                            } else {
                                length = collection.size();
                                strK = c0a.k(length, "[**", "**]");
                            }
                        } else if (absolutePath instanceof Map) {
                            Map map = (Map) absolutePath;
                            strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
                        } else if (absolutePath instanceof Object[]) {
                            Object[] objArr = (Object[]) absolutePath;
                            if (objArr.length == 0) {
                                strK = "[]";
                            } else {
                                length = objArr.length;
                                strK = c0a.k(length, "[**", "**]");
                            }
                        } else if (absolutePath instanceof int[]) {
                            int[] iArr = (int[]) absolutePath;
                            if (iArr.length == 0) {
                                strK = "[]";
                            } else {
                                length = iArr.length;
                                strK = c0a.k(length, "[**", "**]");
                            }
                        } else if (absolutePath instanceof float[]) {
                            float[] fArr = (float[]) absolutePath;
                            if (fArr.length == 0) {
                                strK = "[]";
                            } else {
                                length = fArr.length;
                                strK = c0a.k(length, "[**", "**]");
                            }
                        } else if (absolutePath instanceof long[]) {
                            long[] jArr = (long[]) absolutePath;
                            if (jArr.length == 0) {
                                strK = "[]";
                            } else {
                                length = jArr.length;
                                strK = c0a.k(length, "[**", "**]");
                            }
                        } else if (absolutePath instanceof double[]) {
                            double[] dArr = (double[]) absolutePath;
                            if (dArr.length == 0) {
                                strK = "[]";
                            } else {
                                length = dArr.length;
                                strK = c0a.k(length, "[**", "**]");
                            }
                        } else if (absolutePath instanceof short[]) {
                            short[] sArr = (short[]) absolutePath;
                            if (sArr.length == 0) {
                                strK = "[]";
                            } else {
                                length = sArr.length;
                                strK = c0a.k(length, "[**", "**]");
                            }
                        } else if (absolutePath instanceof byte[]) {
                            byte[] bArr = (byte[]) absolutePath;
                            if (bArr.length == 0) {
                                strK = "[]";
                            } else {
                                length = bArr.length;
                                strK = c0a.k(length, "[**", "**]");
                            }
                        } else if (absolutePath instanceof char[]) {
                            char[] cArr = (char[]) absolutePath;
                            if (cArr.length == 0) {
                                strK = "[]";
                            } else {
                                length = cArr.length;
                                strK = c0a.k(length, "[**", "**]");
                            }
                        } else if (absolutePath instanceof boolean[]) {
                            boolean[] zArr = (boolean[]) absolutePath;
                            if (zArr.length == 0) {
                                strK = "[]";
                            } else {
                                length = zArr.length;
                                strK = c0a.k(length, "[**", "**]");
                            }
                        } else {
                            strK = "***";
                        }
                        a4cVar3.c(je9Var3, str3, qv1.k("Story preview saved to ", strK), null);
                    }
                }
                return fileS;
            case 15:
                DownloadFileAttachWorker downloadFileAttachWorker = (DownloadFileAttachWorker) this.b;
                return new er5((pjh) downloadFileAttachWorker.w.getValue(), downloadFileAttachWorker.b.c, downloadFileAttachWorker.m, downloadFileAttachWorker.n, downloadFileAttachWorker.o, downloadFileAttachWorker.p, downloadFileAttachWorker.v, downloadFileAttachWorker.q, downloadFileAttachWorker.r, (ny8) this.c, downloadFileAttachWorker.s, downloadFileAttachWorker.t, downloadFileAttachWorker.u, (ny8) this.d);
            case 16:
                View view = (View) this.b;
                EditStoryScreen editStoryScreen = (EditStoryScreen) this.c;
                vnh vnhVar = (vnh) this.d;
                zv8[] zv8VarArr = EditStoryScreen.A1;
                if (view.isAttachedToWindow()) {
                    p26 p26VarC1 = editStoryScreen.C1();
                    int[] iArr2 = editStoryScreen.r1;
                    if (p26VarC1.C1.a.getValue() instanceof p16) {
                        mvh mvhVar = new mvh(editStoryScreen.getContext(), view, new i06(editStoryScreen, 0), null, 2, 2, false, 152);
                        mvhVar.c(vnhVar);
                        mvhVar.getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        view.getLocationOnScreen(iArr2);
                        mvhVar.d(new Point((view.getWidth() / 2) + iArr2[0], zo5.D(4.0f, yl5.d().getDisplayMetrics().density, iArr2[1]) - mvhVar.getContentView().getMeasuredHeight()), 0);
                        mvhVar.setOnDismissListener(new nc1(3, editStoryScreen));
                        editStoryScreen.I = mvhVar;
                    }
                }
                return sbi.a;
            case 17:
                p26 p26Var = (p26) this.b;
                return new eoh(p26Var.G(), (nm0) ((ny8) this.c).getValue(), (xhh) ((ny8) this.d).getValue(), p26Var.b);
            case 18:
                ga7 ga7Var = (ga7) this.b;
                ldc ldcVar = (ldc) this.c;
                ec0 ec0Var = (ec0) this.d;
                Iterator it = ga7Var.b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).v(ldcVar, ec0Var);
                }
                return sbi.a;
            case 19:
                sfe sfeVar = (sfe) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.c;
                gd8 gd8Var = (gd8) this.d;
                if (sfeVar.a) {
                    n1g.x().p(byj.a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(gd8Var);
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                jsa jsaVar = (jsa) this.b;
                ny8 ny8Var3 = (ny8) this.c;
                ny8 ny8Var4 = (ny8) this.d;
                ita itaVar = jsaVar.c;
                q24 q24Var = itaVar.i;
                return q24Var != null ? new m24(q24Var, ny8Var3) : new bpa(cqk.D(jsaVar.b, ((n0c) jsaVar.j).a()), (t51) ny8Var4.getValue(), itaVar.a, jsaVar.d.a, ((s7f) jsaVar.q).t());
            case 21:
                jsa jsaVar2 = (jsa) this.b;
                gva gvaVar = (gva) this.c;
                ny8 ny8Var5 = (ny8) this.d;
                ita itaVar2 = jsaVar2.c;
                xt4 xt4Var = jsaVar2.w;
                dq4 dq4Var = jsaVar2.b;
                r8e r8eVar = jsaVar2.w2;
                r8e r8eVar2 = jsaVar2.z2;
                rea reaVar = new rea(2, jsaVar2, jsa.class, "processReactionEffect", "processReactionEffect(Ljava/util/Set;J)V", 0, 4);
                boolean zBooleanValue = ((Boolean) jsaVar2.b2.getValue()).booleanValue();
                boolean zR0 = jsaVar2.r0();
                int i3 = jsaVar2.i;
                lh9 lh9Var = new lh9(11, jsaVar2);
                gvaVar.getClass();
                return new fva(itaVar2, xt4Var, dq4Var, r8eVar, r8eVar2, reaVar, lh9Var, zBooleanValue, zR0, ny8Var5, i3, gvaVar.a, gvaVar.b, gvaVar.c);
            case 22:
                ((tj4) ((a0b) this.b).b.getValue()).a((rj4) this.c, (long[]) this.d, 0L);
                return sbi.a;
            case 23:
                p5b p5bVar = (p5b) this.b;
                k96 k96Var = (k96) this.c;
                final m mVar = (m) this.d;
                return new tp3(new e6b(k96Var, 0), new iaa(mVar, 14, p5bVar), new cf7() { // from class: f6b
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        int i4 = i2;
                        m mVar2 = mVar;
                        Integer num = (Integer) obj;
                        num.getClass();
                        switch (i4) {
                            case 0:
                                return Boolean.valueOf(mVar2.invoke(num) != null);
                            default:
                                return Boolean.valueOf(mVar2.invoke(num) != null);
                        }
                    }
                }, new cf7() { // from class: f6b
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        int i4 = i;
                        m mVar2 = mVar;
                        Integer num = (Integer) obj;
                        num.getClass();
                        switch (i4) {
                            case 0:
                                return Boolean.valueOf(mVar2.invoke(num) != null);
                            default:
                                return Boolean.valueOf(mVar2.invoke(num) != null);
                        }
                    }
                });
            case 24:
                return NAL.client_delegate$lambda$0((NALHostnameVerifier) this.b, (Long) this.c, (X509TrustManager) this.d);
            case 25:
                return new kzb((ny8) this.b, (ny8) this.c, ((q36) this.d).a);
            case 26:
                v0g v0gVar = (v0g) this.b;
                rcc rccVar = (rcc) this.c;
                v0g v0gVar2 = (v0g) this.d;
                v0gVar.setVisibility(8);
                rcc.p(v0gVar);
                rcc.p(v0gVar2);
                rccVar.requestLayout();
                return sbi.a;
            case 27:
                return new TranscodingUploader((Context) this.b, ((wji) ((ny8) this.c).getValue()).a, new e3i(2, ((Number) ((e5d) ((ny8) this.d).getValue()).S5.a(e5d.S6[358]).i()).intValue()));
            case 28:
                return ((lua) this.b).a(((c8e) this.c).c, new ifh(new w40((ny8) this.d, 29)));
            default:
                sb8.N((MainActivity) this.b, (qzb) this.c, (Intent) this.d, false);
                return sbi.a;
        }
    }
}
