package one.me.chatmedia.viewer.video.playbackSpeed;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.bsb;
import defpackage.c;
import defpackage.c0a;
import defpackage.ch3;
import defpackage.dwd;
import defpackage.e8c;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.et3;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h;
import defpackage.j8e;
import defpackage.kbc;
import defpackage.l63;
import defpackage.lq4;
import defpackage.lu8;
import defpackage.mt5;
import defpackage.n09;
import defpackage.n1g;
import defpackage.noh;
import defpackage.ny8;
import defpackage.ol0;
import defpackage.pq3;
import defpackage.pu4;
import defpackage.q9i;
import defpackage.qt4;
import defpackage.qz9;
import defpackage.t2d;
import defpackage.t3f;
import defpackage.tre;
import defpackage.u2d;
import defpackage.ueg;
import defpackage.v0c;
import defpackage.v9c;
import defpackage.vv;
import defpackage.wf4;
import defpackage.xb9;
import defpackage.xva;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\f"}, d2 = {"Lone/me/chatmedia/viewer/video/playbackSpeed/PlaybackSettingsBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "parentScope", "", "currentSpeed", "(Lt3f;F)V", "lu8", "chat-media-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlaybackSettingsBottomSheet extends BaseBottomSheetWidget {
    public final vv m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final j8e q;
    public final j8e r;
    public final DecimalFormat s;
    public static final /* synthetic */ zv8[] u = {new dwd(PlaybackSettingsBottomSheet.class, "currentSpeed", "getCurrentSpeed()F", 0), zo5.f(zfe.a, PlaybackSettingsBottomSheet.class, "currentSpeedView", "getCurrentSpeedView()Lone/me/common/counter/OneMeCounter;", 0), new dwd(PlaybackSettingsBottomSheet.class, "switcher", "getSwitcher()Lone/me/sdk/uikit/common/views/switchcompat/OneMeSwitch;", 0)};
    public static final lu8 t = new lu8();

    public PlaybackSettingsBottomSheet(Bundle bundle) {
        super(bundle);
        this.m = new vv("arg_current_speed", Float.class);
        Object objF0 = tre.f0(bundle, Widget.ARG_SCOPE_ID, t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_key_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.n = getSharedViewModel((t3f) ((Parcelable) objF0), l63.class, null);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.o = hVar.getAccessor().d(85);
        this.p = hVar.getAccessor().d(947);
        this.q = viewBinding(R.id.oneme_playback_settings_sheet_current_speed_view);
        this.r = viewBinding(R.id.oneme_playback_settings_sheet_remember_speed_switch);
        DecimalFormat decimalFormat = new DecimalFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(',');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setGroupingUsed(false);
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setPositiveSuffix("×");
        this.s = decimalFormat;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setPadding(0, gm0.K(10.0f * yl5.d().getDisplayMetrics().density), 0, gm0.K(15.0f * yl5.d().getDisplayMetrics().density));
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        wf4 wf4Var = new wf4(context);
        wf4Var.setLayoutParams(layoutParams);
        wf4Var.setPaddingRelative(wf4Var.getPaddingStart(), wf4Var.getPaddingTop(), wf4Var.getPaddingEnd(), gm0.K(yl5.d().getDisplayMetrics().density * 20.0f));
        mt5 mt5Var = new mt5(wf4Var.getContext());
        mt5Var.setId(R.id.oneme_playback_settings_sheet_drag_handle);
        mt5Var.setCustomTheme(t1());
        wf4Var.addView(mt5Var);
        TextView textView = new TextView(wf4Var.getContext());
        textView.setId(R.id.oneme_playback_settings_sheet_title_view);
        textView.setText(R.string.oneme_chatmedia_viewer_playback_speed_sheet_title);
        noh nohVar = q9i.f;
        q9i.a(nohVar, textView);
        textView.setTextColor(t1().getText().b);
        wf4Var.addView(textView);
        v0c v0cVar = new v0c(wf4Var.getContext());
        v0cVar.setId(R.id.oneme_playback_settings_sheet_current_speed_view);
        v0cVar.setTypography(nohVar);
        v0cVar.setTextColor(t1().getText().b);
        v0cVar.setHasBackground(false);
        int i = 22;
        v0cVar.setNumberFormatter(new ol0(i, this));
        zv8[] zv8VarArr = u;
        zv8 zv8Var = zv8VarArr[0];
        vv vvVar = this.m;
        pu4.c(v0cVar, Float.valueOf(((Number) vvVar.a(this)).floatValue()), false, 6);
        wf4Var.addView(v0cVar);
        e8c e8cVar = new e8c(wf4Var.getContext());
        e8cVar.setId(R.id.oneme_playback_settings_sheet_slider_view);
        e8cVar.p = false;
        e8cVar.setSelectedTrackColor(R.attr.icon_primary_inverse_static);
        e8cVar.setDrawSteps(false);
        e8cVar.setExtendTrack(true);
        e8cVar.setValueFrom(0.2f);
        e8cVar.setValueTo(3.0f);
        e8cVar.setStepSize(0.05f);
        zv8 zv8Var2 = zv8VarArr[0];
        e8cVar.setValue(((Number) vvVar.a(this)).floatValue());
        e8cVar.v.add(new u2d(v0cVar, this));
        a8g a8gVar = pq3.j;
        e8cVar.setCustomTheme(a8gVar.l(e8cVar).b);
        e8cVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 14.0f), e8cVar.getPaddingTop(), gm0.K(14.0f * yl5.d().getDisplayMetrics().density), e8cVar.getPaddingBottom());
        wf4Var.addView(e8cVar);
        ueg uegVar = new ueg(wf4Var.getContext());
        uegVar.setId(R.id.oneme_playback_settings_sheet_preselected_speeds_view);
        uegVar.setListener(new xva(i, this));
        t.getClass();
        uegVar.setButtons(new float[]{0.5f, 1.0f, 1.25f, 1.5f, 2.0f});
        uegVar.setPaddingRelative(uegVar.getPaddingStart(), uegVar.getPaddingTop(), uegVar.getPaddingEnd(), gm0.K(yl5.d().getDisplayMetrics().density * 20.0f));
        wf4Var.addView(uegVar);
        TextView textView2 = new TextView(wf4Var.getContext());
        textView2.setId(R.id.oneme_playback_settings_sheet_remember_speed_title);
        textView2.setText(R.string.oneme_chatmedia_viewer_playback_speed_remember_title);
        q9i.a(nohVar, textView2);
        textView2.setTextColor(t1().getText().b);
        wf4Var.addView(textView2);
        v9c v9cVar = new v9c(wf4Var.getContext());
        v9cVar.setId(R.id.oneme_playback_settings_sheet_remember_speed_switch);
        v9cVar.setChecked(!(((xb9) ((et3) this.o.getValue())).a0() == 0.0f));
        v9cVar.setCustomTheme(a8gVar.l(v9cVar).b);
        v9cVar.setOnCheckedChangeListener(new t2d(this));
        wf4Var.addView(v9cVar);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = mt5Var.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = textView.getId();
        eg4VarH.d(id2, 3, mt5Var.getId(), 4);
        qt4.w(28.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id2));
        eg4VarH.d(id2, 6, 0, 6);
        new bsb(6, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        eg4VarH.d(id2, 4, e8cVar.getId(), 3);
        int id3 = v0cVar.getId();
        eg4VarH.d(id3, 3, textView.getId(), 3);
        eg4VarH.d(id3, 7, 0, 7);
        new bsb(7, eg4VarH, id3).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        eg4VarH.d(id3, 4, textView.getId(), 4);
        int id4 = e8cVar.getId();
        eg4VarH.d(id4, 3, textView.getId(), 4);
        eg4VarH.d(id4, 6, 0, 6);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id4));
        eg4VarH.d(id4, 7, 0, 7);
        new bsb(7, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        int id5 = uegVar.getId();
        eg4VarH.d(id5, 3, e8cVar.getId(), 4);
        eg4VarH.d(id5, 6, 0, 6);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id5));
        eg4VarH.d(id5, 7, 0, 7);
        new bsb(7, eg4VarH, id5).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        int id6 = textView2.getId();
        eg4VarH.d(id6, 3, uegVar.getId(), 4);
        qt4.w(18.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id6));
        eg4VarH.d(id6, 6, 0, 6);
        new bsb(6, eg4VarH, id6).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        eg4VarH.d(id6, 7, v9cVar.getId(), 6);
        eg4VarH.d(id6, 4, 0, 4);
        new bsb(4, eg4VarH, id6).a(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f));
        eg4VarH.g(id6).d.V = 1;
        int id7 = v9cVar.getId();
        eg4VarH.d(id7, 3, textView2.getId(), 3);
        eg4VarH.d(id7, 4, textView2.getId(), 4);
        eg4VarH.d(id7, 6, textView2.getId(), 7);
        eg4VarH.d(id7, 7, 0, 7);
        new bsb(7, eg4VarH, id7).a(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(wf4Var);
        frameLayout.addView(wf4Var);
    }

    public final l63 D1() {
        return (l63) this.n.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e9i.j0(new fz6(n1g.v(D1().F1, getViewLifecycleOwner().f(), n09.d), new qz9((lq4) null, this, 24), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return pq3.j.k(getContext()).b;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void z1() {
        D1().a0(((v9c) this.r.m(this, u[2])).isChecked());
    }

    public PlaybackSettingsBottomSheet(t3f t3fVar, float f) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("arg_current_speed", Float.valueOf(f))));
    }
}
