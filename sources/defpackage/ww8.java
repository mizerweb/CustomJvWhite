package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Layout;
import android.text.Spanned;
import android.view.GestureDetector;
import androidx.recyclerview.widget.RecyclerView;
import java.security.KeyStore;
import java.util.ArrayList;
import one.me.android.MainActivity;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.main.MainScreen;
import one.me.net.ssl.common.internal.MaxApiTrustManager;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.settings.multilang.LocaleBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ww8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ww8(aka akaVar, Layout layout) {
        this.a = 25;
        this.b = layout;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Object[] objArr;
        Object[] spans;
        Object[] objArr2;
        Object[] spans2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                h hVar = ((KeyboardStickersWidget) obj).a;
                return new d4g(hVar.getAccessor().d(355), hVar.getAccessor().d(359));
            case 1:
                cz8 cz8Var = (cz8) obj;
                int iK = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
                w78 w78VarD = w78.d(Uri.parse(cz8Var.a));
                w78VarD.d = new bne(iK, iK, 0.0f, 12);
                w78VarD.k = cz8Var.d;
                deh dehVar = new deh(4);
                dehVar.d = iK;
                dehVar.e = iK;
                w78VarD.f = new eeh(dehVar);
                return w78VarD.a();
            case 2:
                kk9.b.o(true, null, ((h49) ((l49) obj)).a);
                return sbi.a;
            case 3:
                return Integer.valueOf(pq3.j.h((b69) obj).getText().h);
            case 4:
                ((a8d) obj).invoke();
                return sbi.a;
            case 5:
                ((n99) obj).s.start();
                return sbi.a;
            case 6:
                da9 da9Var = (da9) obj;
                Drawable drawable = da9Var.a.getDrawable(R.drawable.icon_spinner_android);
                drawable.setColorFilter(new PorterDuffColorFilter(da9Var.b, PorterDuff.Mode.SRC_IN));
                return drawable;
            case 7:
                tc9 tc9Var = (tc9) ((LocaleBottomSheet) obj).u.getAccessor().c(323);
                return new sc9(null, tc9Var.a, tc9Var.b, tc9Var.c, tc9Var.d);
            case 8:
                qw2 qw2Var = (qw2) ((zg9) obj).d.getValue();
                qw2Var.getClass();
                gm0.y("qw2", "clear", new Object[0]);
                qw2Var.U();
                return sbi.a;
            case 9:
                ia8 ia8VarE = ((MainActivity) obj).z.e();
                if (ia8VarE != null) {
                    ia8VarE.k = null;
                }
                return sbi.a;
            case 10:
                return Boolean.valueOf(MainScreen.q1((MainScreen) obj));
            case 11:
                MaxApiTrustManager maxApiTrustManager = (MaxApiTrustManager) obj;
                maxApiTrustManager.e.getClass();
                long jC = g1b.c();
                KeyStore keyStoreA = hp7.a();
                long jA = ish.a(jC);
                eq eqVar = new eq(keyStoreA);
                long jA2 = ish.a(jC);
                String str = maxApiTrustManager.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.w(qv1.q("ApiTrustManager creation took=", ew5.t(jA2), "{ks=", ew5.t(jA), "|tm="), ew5.t(ew5.o(jA2, jA)), "}"), null);
                    }
                }
                return eqVar;
            case 12:
                return xo9.g((psh) obj);
            case 13:
                return xo9.h((tfk) obj);
            case 14:
                final eu9 eu9Var = (eu9) obj;
                ifg ifgVar = new ifg((Object) null, (lvb) new ww5(1, eu9Var), 0.0f);
                ifgVar.m.b(700.0f);
                ifgVar.m.a(0.57f);
                yw5 yw5Var = new yw5() { // from class: cu9
                    @Override // defpackage.yw5
                    public final void a(float f, boolean z) {
                        Drawable drawable2;
                        eu9 eu9Var2 = eu9Var;
                        Drawable drawable3 = eu9Var2.d;
                        if (!z ? (drawable2 = eu9Var2.p) != null || (drawable2 = eu9Var2.r) != null : (drawable2 = eu9Var2.r) != null || (drawable2 = eu9Var2.p) != null) {
                            drawable3 = drawable2;
                        }
                        eu9.g(eu9Var2, drawable3, null, null, 124);
                    }
                };
                ArrayList arrayList = ifgVar.k;
                if (!arrayList.contains(yw5Var)) {
                    arrayList.add(yw5Var);
                }
                return new du9(ifgVar);
            case 15:
                zv8[] zv8VarArr = MediaGalleryWidget.i;
                return new zg7(((MediaGalleryWidget) obj).r1());
            case 16:
                return "Video duration retrieved: " + ((Long) obj);
            case 17:
                return "Track groups retrieved: " + ((iyh) obj);
            case 18:
                MediaTypePickerWidget mediaTypePickerWidget = (MediaTypePickerWidget) obj;
                l7a l7aVar = (l7a) mediaTypePickerWidget.c.getAccessor().c(1054);
                vv vvVar = mediaTypePickerWidget.b;
                zv8[] zv8VarArr2 = MediaTypePickerWidget.i;
                zv8 zv8Var = zv8VarArr2[1];
                h7a h7aVar = (h7a) mediaTypePickerWidget.getSharedViewModel((t3f) vvVar.a(mediaTypePickerWidget), h7a.class, null).getValue();
                vv vvVar2 = mediaTypePickerWidget.a;
                zv8 zv8Var2 = zv8VarArr2[0];
                long jLongValue = ((Number) vvVar2.a(mediaTypePickerWidget)).longValue();
                zv8 zv8Var3 = zv8VarArr2[1];
                return new k7a(h7aVar, jLongValue, (t3f) vvVar.a(mediaTypePickerWidget), l7aVar.a, l7aVar.b, l7aVar.c, l7aVar.d, l7aVar.e);
            case 19:
                return (kc5) ((v9a) obj).f.invoke();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return Integer.valueOf(((g5d) ((qaa) obj).g).j());
            case 21:
                ((GestureDetector) obj).setIsLongpressEnabled(false);
                return sbi.a;
            case 22:
                return new ng8(((tea) obj).y.getContext());
            case 23:
                hia hiaVar = new hia();
                int i2 = ((xac) pq3.j.h((lia) obj).f().b).a.d;
                Drawable drawable2 = hiaVar.getDrawable(hiaVar.c);
                GradientDrawable gradientDrawable = drawable2 instanceof GradientDrawable ? (GradientDrawable) drawable2 : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(ColorStateList.valueOf(i2));
                }
                hiaVar.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
                return hiaVar;
            case 24:
                return Integer.valueOf(((Rect) obj).height() - (gm0.K(12.0f * yl5.d().getDisplayMetrics().density) * 2));
            case 25:
                CharSequence text = ((Layout) obj).getText();
                Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                if (spanned == null || (spans = spanned.getSpans(0, spanned.length(), y2e.class)) == null) {
                    objArr = spans;
                    objArr = new y2e[0];
                }
                objArr = spans;
                return (y2e[]) objArr;
            case 26:
                CharSequence text2 = ((aka) obj).b().getText();
                Spanned spanned2 = text2 instanceof Spanned ? (Spanned) text2 : null;
                if (spanned2 == null || (spans2 = spanned2.getSpans(0, spanned2.length(), y2e.class)) == null) {
                    objArr2 = spans2;
                    objArr2 = new y2e[0];
                }
                objArr2 = spans2;
                return (y2e[]) objArr2;
            case 27:
                return Integer.valueOf(((xac) pq3.j.h((dka) obj).f().b).b.a);
            case 28:
                q8e q8eVar = new q8e(((bpa) obj).f);
                ua1 ua1Var = new ua1(q8eVar, 4);
                ghb ghbVar = ew5.b;
                lw5 lw5Var = lw5.MILLISECONDS;
                return e9i.m0(new bye(new af8(e9i.r(new cy6(qe7.O(15, lw5Var), null, ua1Var)), null, 21)), tre.G0(new ua1(q8eVar, 5), qe7.O(1000, lw5Var)), new ua1(q8eVar, 6));
            default:
                qqa qqaVar = (qqa) obj;
                RecyclerView recyclerView = qqaVar.h;
                if (recyclerView != null) {
                    vx9 vx9Var = new vx9(qqaVar, 8, recyclerView);
                    if (qqaVar.c().b.d) {
                        vx9Var.invoke();
                    } else {
                        qqaVar.c().b();
                        if (qqaVar.k == null) {
                            qqaVar.k = yab.i0(qqaVar.a, null, 0, new af8(qqaVar, vx9Var, (lq4) null, 22), 3);
                        }
                    }
                }
                return sbi.a;
        }
    }

    public /* synthetic */ ww8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
