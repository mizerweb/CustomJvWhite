package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import one.me.settings.battery.ui.SettingsBatteryScreen;
import one.me.settings.media.SettingsMediaScreen;
import one.me.settings.media.autosave.SettingsAutoSaveScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.stories.publish.PublishStoryBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dyd extends ha implements qf7 {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dyd(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.h = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        ViewGroup viewGroup;
        int i = 1;
        boolean z = false;
        switch (this.h) {
            case 0:
                gyd gydVar = (gyd) this.a;
                zv8[] zv8VarArr = PublishStoryBottomSheet.t;
                gydVar.H((List) obj);
                return sbi.a;
            case 1:
                ((ttf) this.a).H((List) obj);
                return sbi.a;
            case 2:
                mvf mvfVar = (mvf) this.a;
                zv8[] zv8VarArr2 = SettingRingtoneScreen.i;
                mvfVar.H((List) obj);
                return sbi.a;
            case 3:
                fqf fqfVar = (fqf) this.a;
                zv8[] zv8VarArr3 = SettingsAutoSaveScreen.g;
                fqfVar.H((List) obj);
                return sbi.a;
            case 4:
                qqf qqfVar = (qqf) this.a;
                zv8[] zv8VarArr4 = SettingsBatteryScreen.g;
                qqfVar.H((List) obj);
                return sbi.a;
            case 5:
                ttf ttfVar = (ttf) this.a;
                zv8[] zv8VarArr5 = SettingsMediaScreen.h;
                ttfVar.H((List) obj);
                return sbi.a;
            case 6:
                quf qufVar = (quf) this.a;
                zv8[] zv8VarArr6 = SettingsPrivacyScreen.i;
                qufVar.H((List) obj);
                return sbi.a;
            case 7:
                awf awfVar = (awf) this.a;
                zv8[] zv8VarArr7 = SettingsStorageScreen.g;
                awfVar.H((List) obj);
                return sbi.a;
            case 8:
                tg8 tg8Var = (tg8) obj;
                wbg wbgVar = (wbg) this.a;
                wbgVar.getClass();
                if (tg8Var != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = ((pbg) tg8Var).w.animate();
                    viewPropertyAnimatorAnimate.translationY(yl5.d().getDisplayMetrics().density * (-10.0f)).setDuration(200L).setInterpolator((AccelerateDecelerateInterpolator) wbgVar.b.getValue()).withEndAction(new yde(viewPropertyAnimatorAnimate, 28, wbgVar)).start();
                }
                return sbi.a;
            case 9:
                p9f p9fVar = (p9f) obj;
                StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.a;
                zsj zsjVar = stickersSearchScreen.k;
                ow0 ow0Var = stickersSearchScreen.i;
                ow0 ow0Var2 = stickersSearchScreen.j;
                int iD = qt4.D(p9fVar.a);
                if (iD == 0) {
                    View view = stickersSearchScreen.getView();
                    viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup != null) {
                        yab.e(viewGroup, (View) ow0Var.getValue(), -1);
                    }
                    ((View) ow0Var.getValue()).setVisibility(0);
                    a4m.b(ow0Var2);
                    stickersSearchScreen.o1().setVisibility(8);
                    zsjVar.H(r66.a);
                    stickersSearchScreen.o1().setRefreshingNext(false);
                } else if (iD == 1) {
                    zsjVar.H(p9fVar.b);
                    a4m.b(ow0Var);
                    a4m.b(ow0Var2);
                    stickersSearchScreen.o1().setVisibility(0);
                    stickersSearchScreen.o1().setRefreshingNext(stickersSearchScreen.p1().C());
                } else {
                    if (iD != 2) {
                        ore.o();
                        return null;
                    }
                    View view2 = stickersSearchScreen.getView();
                    viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                    if (viewGroup != null) {
                        View view3 = (View) ow0Var2.getValue();
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.topMargin = ((t7c) stickersSearchScreen.h.m(stickersSearchScreen, StickersSearchScreen.l[2])).getMeasuredHeight();
                        yab.d(viewGroup, view3, layoutParams);
                    }
                    ((View) ow0Var2.getValue()).setVisibility(0);
                    a4m.b(ow0Var);
                    stickersSearchScreen.o1().setVisibility(8);
                }
                return sbi.a;
            case 10:
                StickersSearchScreen stickersSearchScreen2 = (StickersSearchScreen) this.a;
                zv8[] zv8VarArr8 = StickersSearchScreen.l;
                stickersSearchScreen2.getClass();
                if (((rbb) obj) instanceof rt3) {
                    ml9.b(stickersSearchScreen2);
                    stickersSearchScreen2.getRouter().D();
                }
                return sbi.a;
            case 11:
                String str = (String) obj;
                vng vngVar = (vng) this.a;
                String name = vng.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    vngVar.getClass();
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, qv1.k("Stickers search. start, q:", str), null);
                    }
                }
                vngVar.n.B(vngVar, vng.p[0], yab.h0(vngVar.b, ((n0c) vngVar.d).b(), 2, new p7g(str, vngVar, (lq4) null, 3)));
                return sbi.a;
            case 12:
                String str2 = (String) obj;
                hog hogVar = (hog) this.a;
                String name2 = hog.class.getName();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    hogVar.getClass();
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, name2, qv1.k("Stickers sets search. start, q:", str2), null);
                    }
                }
                hogVar.i.B(hogVar, hog.j[0], yab.i0(hogVar.c, null, 2, new xra(str2, hogVar, (lq4) null, 20), 1));
                return sbi.a;
            case 13:
                qog qogVar = (qog) obj;
                rog rogVar = (rog) this.a;
                rogVar.getClass();
                if (qogVar.a != null && qogVar.b != null && qogVar.c != null) {
                    c79 c79VarW = yab.w();
                    List list = qogVar.a;
                    List list2 = list;
                    xnh xnhVar = (list2 == null || list2.isEmpty()) ? null : new xnh(rogVar.B(list));
                    tnh tnhVar = new tnh(R.string.oneme_stickers_settings_recent_title);
                    bz8 bz8Var = new bz8(R.drawable.icon_recent, 0, 6);
                    fsf fsfVar = fsf.a;
                    ctf ctfVar = new ctf(9223372036854775806L, 0, tnhVar, null, null, xnhVar, bz8Var, fsfVar, null, false, null, 1816);
                    log.b.getClass();
                    c79VarW.add(new uaf(ctfVar, new i65(":stickers/recent"), R.id.oneme_stickers_settings_recent_view_type, 9223372036854775806L, 1));
                    List list3 = qogVar.b;
                    List list4 = list3;
                    c79VarW.add(new uaf(new ctf(9223372036854775805L, 0, new tnh(R.string.oneme_stickers_settings_favorite_title), null, null, (list4 == null || list4.isEmpty()) ? null : new xnh(rogVar.B(list3)), new bz8(R.drawable.icon_bookmark, 0, 6), fsfVar, null, false, null, 1816), new i65(":stickers/favorite"), R.id.oneme_stickers_settings_favorite_view_type, 9223372036854775805L, 3));
                    List list5 = qogVar.c;
                    if (list5 != null && !list5.isEmpty()) {
                        c79VarW.add(new paf(new tnh(R.string.oneme_stickers_settings_sets_title)));
                        List<emg> list6 = qogVar.c;
                        List list7 = list6;
                        if (list7 != null && !list7.isEmpty()) {
                            for (emg emgVar : list6) {
                                long j = emgVar.a;
                                String str3 = emgVar.c;
                                String str4 = emgVar.b;
                                boolean z2 = z;
                                c79VarW.add(new taf(j, str3, str4 == null ? "" : str4, rogVar.B(emgVar.h), emgVar.g, list6.size() > i ? i : z2, emgVar.d == ((s7f) ((et3) rogVar.g.getValue())).t() ? true : z2));
                                z = z2;
                                i = 1;
                            }
                        }
                    }
                    c79 c79VarJ = yab.j(c79VarW);
                    rogVar.h.setValue(c79VarJ);
                    String name3 = rog.class.getName();
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        je9 je9Var3 = je9.d;
                        if (a4cVar3.b(je9Var3)) {
                            a4cVar3.c(je9Var3, name3, zo5.h(c79VarJ.getSize(), "process sections. finish, size:"), null);
                        }
                    }
                }
                return sbi.a;
            case 14:
                z3g z3gVar = (z3g) obj;
                StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) this.a;
                bog bogVar = stickersShowcaseScreen.l;
                ow0 ow0Var3 = stickersShowcaseScreen.i;
                ow0 ow0Var4 = stickersShowcaseScreen.j;
                int iD2 = qt4.D(z3gVar.a);
                if (iD2 == 0) {
                    View view4 = stickersShowcaseScreen.getView();
                    viewGroup = view4 instanceof ViewGroup ? (ViewGroup) view4 : null;
                    if (viewGroup != null) {
                        yab.e(viewGroup, (View) ow0Var3.getValue(), -1);
                    }
                    ((View) ow0Var3.getValue()).setVisibility(0);
                    a4m.b(ow0Var4);
                    stickersShowcaseScreen.o1().setVisibility(8);
                    bogVar.H(r66.a);
                    stickersShowcaseScreen.o1().setRefreshingNext(false);
                } else if (iD2 == 1 || iD2 == 2) {
                    bogVar.H(z3gVar.b);
                    a4m.b(ow0Var3);
                    a4m.b(ow0Var4);
                    stickersShowcaseScreen.o1().setVisibility(0);
                    stickersShowcaseScreen.o1().setRefreshingNext(stickersShowcaseScreen.p1().B());
                } else {
                    if (iD2 != 3) {
                        ore.o();
                        return null;
                    }
                    View view5 = stickersShowcaseScreen.getView();
                    viewGroup = view5 instanceof ViewGroup ? (ViewGroup) view5 : null;
                    if (viewGroup != null) {
                        View view6 = (View) ow0Var4.getValue();
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams2.topMargin = ((rcc) stickersShowcaseScreen.g.m(stickersShowcaseScreen, StickersShowcaseScreen.m[1])).getMeasuredHeight();
                        yab.d(viewGroup, view6, layoutParams2);
                    }
                    ow0Var4.getValue();
                    ((View) ow0Var4.getValue()).setVisibility(0);
                    a4m.b(ow0Var3);
                    stickersShowcaseScreen.o1().setVisibility(8);
                }
                return sbi.a;
            case 15:
                y3g y3gVar = (y3g) obj;
                StickersShowcaseScreen stickersShowcaseScreen2 = (StickersShowcaseScreen) this.a;
                if (y3gVar != null) {
                    g8c g8cVar = stickersShowcaseScreen2.k;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    h8c h8cVar = new h8c(stickersShowcaseScreen2);
                    h8cVar.h(new w8c(y3gVar.a));
                    h8cVar.n(stickersShowcaseScreen2.getContext().getString(y3gVar.b));
                    stickersShowcaseScreen2.k = h8cVar.p();
                } else {
                    zv8[] zv8VarArr9 = StickersShowcaseScreen.m;
                    stickersShowcaseScreen2.getClass();
                }
                return sbi.a;
            case 16:
                StickersShowcaseScreen stickersShowcaseScreen3 = (StickersShowcaseScreen) this.a;
                zv8[] zv8VarArr10 = StickersShowcaseScreen.m;
                if (((rbb) obj) instanceof rt3) {
                    stickersShowcaseScreen3.getRouter().D();
                } else {
                    stickersShowcaseScreen3.getClass();
                }
                return sbi.a;
            case 17:
                spg spgVar = (spg) this.a;
                spgVar.getClass();
                c79 c79VarW2 = yab.w();
                for (clg clgVar : (List) obj) {
                    String str5 = clgVar.h;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (str5.length() == 0) {
                        str5 = clgVar.d;
                    }
                    long j2 = clgVar.a;
                    long j3 = clgVar.k;
                    c79VarW2.add(new tlg(j2, j3, j3, str5, clgVar.l, clgVar.o, clgVar.b, clgVar.c, false, false, 0L, 0, 15936));
                }
                spgVar.r.setValue(yab.j(c79VarW2));
                return sbi.a;
            case 18:
                ((f8i) this.a).H((List) obj);
                return sbi.a;
            default:
                iwi iwiVar = (iwi) obj;
                pti ptiVar = (pti) this.a;
                if (iwiVar == null) {
                    ptiVar.getClass();
                    ore.o();
                    return null;
                }
                RecyclerView recyclerView = ptiVar.h;
                if ((iwiVar.a.equals("video_fetching_autoplay") || iwiVar.a.equals("messages_video_prefetch_id")) && recyclerView != null) {
                    String str6 = ptiVar.g;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9 je9Var4 = je9.d;
                        if (a4cVar4.b(je9Var4)) {
                            a4cVar4.c(je9Var4, str6, "Player autoplay. Handle fetch event, try start autoplay.", null);
                        }
                    }
                    if (recyclerView.getScrollState() == 0) {
                        ptiVar.h(recyclerView, false);
                    }
                }
                return sbi.a;
        }
    }
}
