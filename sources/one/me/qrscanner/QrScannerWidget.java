package one.me.qrscanner;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.bad;
import defpackage.bc1;
import defpackage.bsb;
import defpackage.bye;
import defpackage.ca2;
import defpackage.ch3;
import defpackage.d0e;
import defpackage.d4f;
import defpackage.d97;
import defpackage.dne;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.ene;
import defpackage.ev;
import defpackage.fh2;
import defpackage.fz6;
import defpackage.g19;
import defpackage.gcc;
import defpackage.ghd;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hgd;
import defpackage.i19;
import defpackage.ic6;
import defpackage.ifh;
import defpackage.igd;
import defpackage.iyl;
import defpackage.j1a;
import defpackage.j1f;
import defpackage.j5c;
import defpackage.j8e;
import defpackage.k0e;
import defpackage.ks6;
import defpackage.l0e;
import defpackage.l1f;
import defpackage.lq4;
import defpackage.lt7;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.m1f;
import defpackage.m5c;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n65;
import defpackage.n68;
import defpackage.np2;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o0e;
import defpackage.ore;
import defpackage.p09;
import defpackage.p0e;
import defpackage.p0m;
import defpackage.p48;
import defpackage.p7d;
import defpackage.pq3;
import defpackage.q0d;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.r48;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sgg;
import defpackage.sj8;
import defpackage.svj;
import defpackage.t0e;
import defpackage.tre;
import defpackage.tyd;
import defpackage.u48;
import defpackage.uf4;
import defpackage.voc;
import defpackage.vp4;
import defpackage.vv;
import defpackage.w48;
import defpackage.wf4;
import defpackage.wsc;
import defpackage.wtc;
import defpackage.ww6;
import defpackage.wxl;
import defpackage.wz6;
import defpackage.xbc;
import defpackage.xc3;
import defpackage.xc9;
import defpackage.xx6;
import defpackage.y48;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.qrscanner.QrScannerWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.tamtam.exception.IssueKeyException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lone/me/qrscanner/QrScannerWidget;", "Lone/me/sdk/arch/Widget;", "Lz4f;", "Lj1a;", "Lvp4;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "canSelectFile", "", "sourceId", "Lk0e;", "mode", "Lha9;", "localAccountId", "(ZLjava/lang/Long;Lk0e;Lha9;)V", "a", "qr-scanner"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class QrScannerWidget extends Widget implements z4f, j1a, vp4, mc4 {
    public static final /* synthetic */ zv8[] w = {new dwd(QrScannerWidget.class, "isPickFromGalleryEnabled", "isPickFromGalleryEnabled()Z", 0), zo5.f(zfe.a, QrScannerWidget.class, "sourceId", "getSourceId()Ljava/lang/Long;", 0), new dwd(QrScannerWidget.class, "mode", "getMode()Lone/me/qrscanner/deeplink/QrScannerMode;", 0), new dwd(QrScannerWidget.class, "cameraPreview", "getCameraPreview()Landroidx/camera/view/PreviewView;", 0), new dwd(QrScannerWidget.class, "overlayView", "getOverlayView()Lone/me/qrscanner/QrScanOverlayView;", 0), new dwd(QrScannerWidget.class, "torchButton", "getTorchButton()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton;", 0), new dwd(QrScannerWidget.class, "hintText", "getHintText()Landroid/widget/TextView;", 0), new dwd(QrScannerWidget.class, "blackoutView", "getBlackoutView()Landroid/widget/FrameLayout;", 0)};
    public static final int x = tre.I0(-16777216, 0.25f);
    public static final Size y = new Size(1280, 720);
    public final vv a;
    public final vv b;
    public final vv c;
    public final wtc d;
    public final ks6 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public final j8e o;
    public final RectF p;
    public p09 q;
    public boolean r;
    public ViewPropertyAnimator s;
    public ViewPropertyAnimator t;
    public boolean u;
    public final ifh v;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/qrscanner/QrScannerWidget$a;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "qr-scanner"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends IssueKeyException {
        public a(Throwable th) {
            super(2, "22193", null, th);
        }
    }

    public QrScannerWidget(Bundle bundle) {
        super(bundle);
        this.a = new vv("can_select_file", Boolean.class);
        this.b = new vv("source_id", Long.class);
        this.c = new vv("mode", k0e.class);
        this.d = new wtc(m35getAccountScopeuqN4xOY());
        this.e = tre.E(this, new p0e(this, 0), new p0e(this, 1));
        int i = 2;
        this.f = createViewModelLazy(o0e.class, new ztd(i, new p0e(this, i)));
        this.g = rx8.P(3, new p0e(this, 3));
        this.h = rx8.P(3, new p0e(this, 4));
        int i2 = 5;
        this.i = rx8.P(3, new p0e(this, i2));
        this.j = rx8.P(3, new p0e(this, 6));
        this.k = viewBinding(R.id.qrscanner_camera_preview);
        this.l = viewBinding(R.id.qrscanner_overlay_view);
        this.m = viewBinding(R.id.qrscanner_torch_button_image);
        this.n = viewBinding(R.id.qrscanner_hint_view);
        this.o = viewBinding(R.id.qrscanner_blackout_view);
        this.p = new RectF();
        this.v = new ifh(new tyd(i2));
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            startActivityForResult(intent, 228);
            return;
        }
        o0e o0eVarT1 = t1();
        zv8 zv8Var = w[1];
        Long l = (Long) this.b.a(this);
        ic6 ic6Var = o0eVarT1.g;
        l0e.b.getClass();
        n65 n65Var = new n65();
        n65Var.a = ":media-picker/select/photo";
        n65Var.d(Boolean.TRUE, "from_qr_scanner");
        if (l != null) {
            n65Var.d(l, "source_id");
        }
        bc1.q(n65Var.b(), ic6Var);
    }

    @Override // defpackage.mc4
    public final void H(Bundle bundle) {
        if (bundle == null || bundle.getInt("dialog_id") != 0) {
            return;
        }
        t1().B(j1f.a);
    }

    @Override // defpackage.j1a
    public final void Y(String str) {
        u1(Uri.parse(str));
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (bundle != null) {
            int i2 = bundle.getInt("dialog_id");
            boolean z = false;
            if (i2 != 0) {
                if (i2 == 1 && i == R.id.qrscanner_allow_permission) {
                    wsc wscVarS1 = s1();
                    new ca2(m35getAccountScopeuqN4xOY()).getAccessor().d(35);
                    String[] strArr = wsc.o;
                    wscVarS1.getClass();
                    for (String str : strArr) {
                        if ((Build.VERSION.SDK_INT < 29 || !kotlin.collections.a.N0(wsc.q, str)) ? shouldShowRequestPermissionRationale(str) : true) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        s1().o(new svj(this, 1));
                        return;
                    } else {
                        String str2 = sj8.a;
                        sj8.g(getContext());
                        return;
                    }
                }
                return;
            }
            if (i != R.id.qrscanner_allow_permission) {
                if (i == R.id.qrscanner_not_allow_permission) {
                    t1().B(j1f.a);
                    return;
                }
                return;
            }
            wsc wscVarS2 = s1();
            new ca2(m35getAccountScopeuqN4xOY()).getAccessor().d(35);
            String[] strArr2 = wsc.n;
            wscVarS2.getClass();
            for (String str3 : strArr2) {
                if ((Build.VERSION.SDK_INT < 29 || !kotlin.collections.a.N0(wsc.q, str3)) ? shouldShowRequestPermissionRationale(str3) : true) {
                    z = true;
                    break;
                }
            }
            if (z) {
                s1().m(new svj(this, 1), strArr2, 158);
            } else {
                String str4 = sj8.a;
                sj8.g(getContext());
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.e;
    }

    public final void o1() {
        p09 p09Var;
        if (this.r || ((Boolean) t1().j.a.getValue()).booleanValue() || (p09Var = this.q) == null) {
            return;
        }
        ExecutorService executorService = (ExecutorService) this.g.getValue();
        p48 p48Var = t1().f;
        wxl.a();
        p48 p48Var2 = p09Var.h;
        if (p48Var2 == p48Var && p09Var.g == executorService) {
            return;
        }
        p09Var.g = executorService;
        p09Var.h = p48Var;
        p09Var.i.N(executorService, p48Var);
        p09Var.m(p48Var2, p48Var);
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        if (i != 228 || i2 != -1 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        u1(data);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        if (this.q == null || !s1().c(wsc.n)) {
            return;
        }
        try {
            p09 p09Var = this.q;
            if (p09Var != null) {
                g19 viewLifecycleOwner = getViewLifecycleOwner();
                wxl.a();
                p09Var.L = viewLifecycleOwner;
                p09Var.t(null);
            }
            o1();
        } catch (IllegalStateException e) {
            gm0.V(QrScannerWidget.class.getName(), "Failed to bind camera on attach", e);
            w1();
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String strQ;
        float f;
        m5c m5cVar;
        int i;
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        wf4 wf4Var = new wf4(context);
        wf4Var.setLayoutParams(layoutParams);
        lvb.G(wf4Var);
        final int i2 = 0;
        wf4Var.setClipChildren(false);
        a8g a8gVar = pq3.j;
        wf4Var.setBackgroundColor(a8gVar.l(wf4Var).b.b().c);
        ghd ghdVar = new ghd(wf4Var.getContext());
        ghdVar.setId(R.id.qrscanner_camera_preview);
        ghdVar.setLayoutParams(new uf4(-1, -1));
        wf4Var.addView(ghdVar);
        d0e d0eVar = new d0e(wf4Var.getContext());
        d0eVar.setId(R.id.qrscanner_overlay_view);
        d0eVar.setLayoutParams(new uf4(-1, -1));
        d0eVar.setAlpha(0.0f);
        wf4Var.addView(d0eVar);
        FrameLayout frameLayout = new FrameLayout(wf4Var.getContext());
        frameLayout.setId(R.id.qrscanner_blackout_view);
        frameLayout.setLayoutParams(new uf4(-1, -1));
        frameLayout.setBackgroundColor(-16777216);
        wf4Var.addView(frameLayout);
        rcc rccVar = new rcc(wf4Var.getContext());
        rccVar.setId(R.id.qrscanner_toolbar);
        rccVar.setLayoutParams(new uf4(-1, -2));
        rccVar.setTitle(R.string.oneme_qrscanner_toolbar_title);
        rccVar.setLeftActions(new xbc(new p7d(15, this)));
        rccVar.setForm(gcc.Compact);
        rccVar.setCustomTheme(a8gVar.l(rccVar).b);
        lvb.I(rccVar);
        wf4Var.addView(rccVar);
        TextView textView = new TextView(wf4Var.getContext());
        textView.setId(R.id.qrscanner_hint_view);
        textView.setLayoutParams(new uf4(-1, -2));
        textView.setVisibility(0);
        q9i.a(q9i.p, textView);
        n1g.N(new xc9(3, null, 11), textView);
        int iOrdinal = q1().ordinal();
        zv8[] zv8VarArr = w;
        vv vvVar = this.a;
        if (iOrdinal == 0) {
            zv8 zv8Var = zv8VarArr[0];
            strQ = ((Boolean) vvVar.a(this)).booleanValue() ? np4.q(textView.getContext(), R.string.oneme_qrscanner_hint_with_gallery) : np4.q(textView.getContext(), R.string.oneme_qrscanner_hint_without_gallery);
        } else {
            if (iOrdinal != 1) {
                ore.o();
                return null;
            }
            strQ = np4.q(textView.getContext(), R.string.oneme_qrscanner_hint_login);
        }
        textView.setText(strQ);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setShadowLayer(yl5.d().getDisplayMetrics().density * 10.0f, 0.0f, yl5.d().getDisplayMetrics().density * 10.0f, x);
        wf4Var.addView(textView);
        zv8 zv8Var2 = zv8VarArr[0];
        boolean zBooleanValue = ((Boolean) vvVar.a(this)).booleanValue();
        j5c j5cVar = j5c.b;
        if (!zBooleanValue || q1() == k0e.LOGIN) {
            f = 52.0f;
            m5cVar = null;
        } else {
            m5cVar = new m5c(wf4Var.getContext());
            m5cVar.setId(R.id.qrscanner_gallery_button_image);
            f = 52.0f;
            m5cVar.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(yl5.d().getDisplayMetrics().density * 52.0f)));
            m5cVar.setMode(j5cVar);
            zv8 zv8Var3 = zv8VarArr[0];
            m5cVar.setVisibility(((Boolean) vvVar.a(this)).booleanValue() ? 0 : 8);
            a8gVar.h(m5cVar);
            Drawable drawable = getContext().getDrawable(R.drawable.icon_media_fill);
            qe7.K(-1, drawable);
            m5cVar.b(drawable, "M6.922 6.664L6.358 6.711l0.123-0.378 0.021-0.061C6.747 5.538 6.963 4.889 7.226 4.37c0.292-0.576 0.668-1.052 1.257-1.409 0.594-0.361 1.201-0.47 1.855-0.46 0.594 0.009 1.29 0.12 2.083 0.246l0.063 0.01c1.02 0.162 2.131 0.366 3.132 0.611 1 0.244 2.08 0.575 3.061 0.901l0.06 0.02c0.762 0.253 1.431 0.476 1.962 0.741 0.585 0.293 1.073 0.67 1.435 1.264 0.358 0.588 0.472 1.184 0.466 1.829-0.006 0.582-0.113 1.258-0.234 2.023l-0.01 0.063c-0.09 0.567-0.198 1.144-0.327 1.673-0.129 0.528-0.299 1.09-0.481 1.635l-0.02 0.061c-0.245 0.734-0.462 1.384-0.725 1.903-0.205 0.404-0.452 0.76-0.785 1.06 0.048-0.587 0.082-1.204 0.082-1.791 0-0.599-0.036-1.229-0.085-1.826l-0.01-0.118c-0.06-0.723-0.124-1.507-0.282-2.184-0.194-0.829-0.556-1.656-1.287-2.387-0.744-0.742-1.588-1.098-2.42-1.288-0.687-0.157-1.488-0.222-2.239-0.283l-0.118-0.01C12.609 6.569 11.436 6.5 10.35 6.5c-1.087 0-2.26 0.069-3.31 0.154l-0.118 0.01zM10.35 21.5c-1.03 0-2.158-0.065-3.187-0.149l-0.064-0.006c-0.8-0.065-1.503-0.122-2.082-0.254-0.638-0.146-1.201-0.396-1.693-0.887-0.487-0.487-0.74-1.039-0.886-1.667-0.133-0.567-0.189-1.249-0.253-2.02L2.18 16.452C2.132 15.88 2.1 15.294 2.1 14.75s0.032-1.13 0.08-1.703l0.005-0.064c0.064-0.771 0.12-1.453 0.253-2.02 0.146-0.628 0.399-1.18 0.886-1.667 0.492-0.491 1.055-0.741 1.693-0.887 0.579-0.132 1.282-0.189 2.082-0.254l0.064-0.006C8.192 8.065 9.32 8 10.35 8c1.03 0 2.158 0.065 3.187 0.149l0.064 0.006c0.8 0.065 1.503 0.122 2.082 0.254 0.638 0.146 1.201 0.396 1.693 0.887 0.488 0.487 0.74 1.039 0.887 1.667 0.132 0.567 0.188 1.249 0.252 2.02l0.006 0.064c0.047 0.573 0.079 1.159 0.079 1.703s-0.032 1.13-0.079 1.702l-0.006 0.065c-0.064 0.771-0.12 1.453-0.252 2.02-0.147 0.628-0.399 1.18-0.887 1.667-0.492 0.491-1.055 0.741-1.693 0.887-0.579 0.132-1.282 0.189-2.082 0.254l-0.064 0.006C12.508 21.435 11.38 21.5 10.35 21.5zM7.85 13c0 0.69-0.56 1.25-1.25 1.25S5.35 13.69 5.35 13s0.56-1.25 1.25-1.25S7.85 12.31 7.85 13zm-0.524 6.357c1.001 0.082 2.07 0.143 3.024 0.143 0.954 0 2.023-0.061 3.024-0.143 0.883-0.072 1.441-0.12 1.864-0.216 0.38-0.087 0.568-0.196 0.725-0.352 0.161-0.162 0.268-0.347 0.352-0.707 0.095-0.406 0.141-0.94 0.212-1.795l0.019-0.234c-0.827-0.714-1.709-1.391-2.687-1.977-0.559-0.335-1.257-0.328-1.805 0.025-2.041 1.31-4.193 3.377-5.87 5.153 0.31 0.035 0.682 0.066 1.142 0.103z", yl5.d().getDisplayMetrics().density * 24.0f);
            m5cVar.setOnClickListener(new View.OnClickListener(this) { // from class: q0e
                public final /* synthetic */ QrScannerWidget b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Integer num;
                    int i3 = i2;
                    boolean z = false;
                    QrScannerWidget qrScannerWidget = this.b;
                    switch (i3) {
                        case 0:
                            zv8[] zv8VarArr2 = QrScannerWidget.w;
                            if (!qrScannerWidget.s1().f()) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("dialog_id", 1);
                                zv8[] zv8VarArr3 = BottomSheetWidget.t;
                                jc4 jc4VarC = p.c(R.string.permissions_allow_access, bundle2, null, 4);
                                jc4VarC.i(Integer.valueOf(R.drawable.icon_media));
                                jc4VarC.g(new tnh(R.string.oneme_qrscanner_storage_request_description));
                                jc4VarC.a(new kc4(R.id.qrscanner_allow_permission, new tnh(R.string.permissions_dialog_yes), 3, true, 3, 2), new kc4(R.id.qrscanner_not_allow_permission, new tnh(R.string.permissions_dialog_no), 2, true, 3, 2));
                                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(qrScannerWidget);
                                confirmationBottomSheetF.setTargetController(qrScannerWidget);
                                br4 parentController = qrScannerWidget;
                                while (parentController.getParentController() != null) {
                                    parentController = parentController.getParentController();
                                }
                                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                                if (hveVarU1 != null) {
                                    lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                                    p.k(false, lveVar, true, "BottomSheetWidget");
                                    hveVarU1.I(lveVar);
                                }
                            } else {
                                pp4 pp4VarB = opl.b(qrScannerWidget, 2);
                                tnh tnhVar = new tnh(R.string.attach_gallery);
                                Integer numValueOf = Integer.valueOf(R.drawable.icon_image_add);
                                Integer numValueOf2 = Integer.valueOf(R.attr.icon_primary);
                                pp4VarB.l(xw3.P0(new rp4(0, tnhVar, numValueOf, numValueOf2, 4), new rp4(1, new tnh(R.string.media_files), Integer.valueOf(R.drawable.icon_folder), numValueOf2, 4))).t(new tnh(R.string.oneme_qrscanner_context_menu_title)).build().u(qrScannerWidget);
                            }
                            break;
                        default:
                            p09 p09Var = qrScannerWidget.q;
                            if (p09Var != null) {
                                wxl.a();
                                ia7 ia7Var = p09Var.B;
                                if (ia7Var != null && (num = (Integer) ia7Var.d()) != null && num.intValue() == 1) {
                                    z = true;
                                }
                            }
                            boolean z2 = !z;
                            p09 p09Var2 = qrScannerWidget.q;
                            if (p09Var2 != null) {
                                p09Var2.h(z2);
                            }
                            break;
                    }
                }
            });
            wf4Var.addView(m5cVar);
        }
        m5c m5cVar2 = new m5c(wf4Var.getContext());
        m5cVar2.setId(R.id.qrscanner_torch_button_image);
        m5cVar2.setLayoutParams(new uf4(gm0.K(f * yl5.d().getDisplayMetrics().density), gm0.K(f * yl5.d().getDisplayMetrics().density)));
        m5cVar2.setMode(j5cVar);
        final int i3 = 1;
        m5cVar2.setOnClickListener(new View.OnClickListener(this) { // from class: q0e
            public final /* synthetic */ QrScannerWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer num;
                int i4 = i3;
                boolean z = false;
                QrScannerWidget qrScannerWidget = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr2 = QrScannerWidget.w;
                        if (!qrScannerWidget.s1().f()) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("dialog_id", 1);
                            zv8[] zv8VarArr3 = BottomSheetWidget.t;
                            jc4 jc4VarC = p.c(R.string.permissions_allow_access, bundle2, null, 4);
                            jc4VarC.i(Integer.valueOf(R.drawable.icon_media));
                            jc4VarC.g(new tnh(R.string.oneme_qrscanner_storage_request_description));
                            jc4VarC.a(new kc4(R.id.qrscanner_allow_permission, new tnh(R.string.permissions_dialog_yes), 3, true, 3, 2), new kc4(R.id.qrscanner_not_allow_permission, new tnh(R.string.permissions_dialog_no), 2, true, 3, 2));
                            ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(qrScannerWidget);
                            confirmationBottomSheetF.setTargetController(qrScannerWidget);
                            br4 parentController = qrScannerWidget;
                            while (parentController.getParentController() != null) {
                                parentController = parentController.getParentController();
                            }
                            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                            hve hveVarU1 = rootController != null ? rootController.u1() : null;
                            if (hveVarU1 != null) {
                                lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                                p.k(false, lveVar, true, "BottomSheetWidget");
                                hveVarU1.I(lveVar);
                            }
                        } else {
                            pp4 pp4VarB = opl.b(qrScannerWidget, 2);
                            tnh tnhVar = new tnh(R.string.attach_gallery);
                            Integer numValueOf = Integer.valueOf(R.drawable.icon_image_add);
                            Integer numValueOf2 = Integer.valueOf(R.attr.icon_primary);
                            pp4VarB.l(xw3.P0(new rp4(0, tnhVar, numValueOf, numValueOf2, 4), new rp4(1, new tnh(R.string.media_files), Integer.valueOf(R.drawable.icon_folder), numValueOf2, 4))).t(new tnh(R.string.oneme_qrscanner_context_menu_title)).build().u(qrScannerWidget);
                        }
                        break;
                    default:
                        p09 p09Var = qrScannerWidget.q;
                        if (p09Var != null) {
                            wxl.a();
                            ia7 ia7Var = p09Var.B;
                            if (ia7Var != null && (num = (Integer) ia7Var.d()) != null && num.intValue() == 1) {
                                z = true;
                            }
                        }
                        boolean z2 = !z;
                        p09 p09Var2 = qrScannerWidget.q;
                        if (p09Var2 != null) {
                            p09Var2.h(z2);
                        }
                        break;
                }
            }
        });
        wf4Var.addView(m5cVar2);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = rccVar.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = ghdVar.getId();
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.d(id2, 4, 0, 4);
        int id3 = d0eVar.getId();
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, 0, 7);
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 4, 0, 4);
        int id4 = frameLayout.getId();
        eg4VarH.d(id4, 6, 0, 6);
        eg4VarH.d(id4, 3, 0, 3);
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.d(id4, 4, 0, 4);
        int id5 = textView.getId();
        eg4VarH.d(id5, 6, 0, 6);
        qt4.w(30.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id5));
        eg4VarH.d(id5, 7, 0, 7);
        qt4.w(30.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id5));
        eg4VarH.d(id5, 4, 0, 4);
        qt4.w(150.0f, yl5.d().getDisplayMetrics().density, new bsb(4, eg4VarH, id5));
        if (m5cVar != null) {
            int id6 = m5cVar.getId();
            eg4VarH.d(id6, 6, 0, 6);
            qt4.w(108.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id6));
            eg4VarH.d(id6, 4, 0, 4);
            qt4.w(64.0f, yl5.d().getDisplayMetrics().density, new bsb(4, eg4VarH, id6));
        }
        int id7 = m5cVar2.getId();
        if (m5cVar != null) {
            eg4VarH.d(id7, 6, m5cVar.getId(), 7);
            qt4.w(40.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id7));
            i = 0;
            eg4VarH.d(id7, 7, 0, 7);
            qt4.w(108.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id7));
        } else {
            i = 0;
            eg4VarH.d(id7, 6, 0, 6);
            eg4VarH.d(id7, 7, 0, 7);
        }
        eg4VarH.d(id7, 4, i, 4);
        new bsb(4, eg4VarH, id7).a(gm0.K(64.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(wf4Var);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.s;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.s = null;
        ViewPropertyAnimator viewPropertyAnimator2 = this.t;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        this.t = null;
        p09 p09Var = this.q;
        if (p09Var != null) {
            p09Var.x();
        }
        this.q = null;
        this.p.setEmpty();
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        p1();
        p09 p09Var = this.q;
        if (p09Var != null) {
            p09Var.x();
        }
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158) {
            for (int i2 : iArr) {
                if (i2 == 0) {
                    w1();
                    return;
                }
            }
            t1().B(j1f.a);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        if (!getContext().getPackageManager().hasSystemFeature("android.hardware.camera")) {
            t1().B(l1f.a);
        }
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(15, this));
        }
        lq4 lq4Var = null;
        if (s1().c(wsc.n)) {
            w1();
        } else {
            mjg mjgVar = t1().n;
            Boolean bool = Boolean.TRUE;
            mjgVar.getClass();
            mjgVar.j(null, bool);
        }
        int i = 3;
        xx6 xx6VarA = iyl.a(((ghd) this.k.m(this, w[3])).getPreviewStreamState());
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i2 = 0;
        e9i.j0(new fz6(n1g.v(xx6VarA, i19VarF, n09Var), new t0e(lq4Var, this, i2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().g, getViewLifecycleOwner().f(), n09Var), new t0e(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new xc3(t1().o, 28), getViewLifecycleOwner().f(), n09Var), new t0e(lq4Var, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().m, getViewLifecycleOwner().f(), n09Var), new t0e(lq4Var, this, i), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().j, getViewLifecycleOwner().f(), n09Var), new t0e(lq4Var, this, 4), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new bye(new wz6((Object) new q0d(t1().e, this, 11), (Object) new np2(3, (lq4) null, 4), lq4Var, i2)), getViewLifecycleOwner().f(), n09Var), new d97(lq4Var, view, this, 24), i), getViewLifecycleScope());
    }

    public final void p1() {
        p09 p09Var = this.q;
        if (p09Var != null) {
            wxl.a();
            p48 p48Var = p09Var.h;
            p09Var.g = null;
            p09Var.h = null;
            u48 u48Var = p09Var.i;
            synchronized (u48Var.u) {
                try {
                    w48 w48Var = u48Var.v;
                    if (w48Var != null) {
                        w48Var.h(null, null);
                    }
                    if (u48Var.x != null) {
                        u48Var.e = 2;
                        u48Var.t();
                    }
                    u48Var.w = null;
                    u48Var.x = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            p09Var.m(p48Var, null);
        }
    }

    @Override // defpackage.j1a
    public final void q(String str, RectF rectF, Rect rect) {
    }

    public final k0e q1() {
        zv8 zv8Var = w[2];
        return (k0e) this.c.a(this);
    }

    public final d0e r1() {
        return (d0e) this.l.m(this, w[4]);
    }

    public final wsc s1() {
        return (wsc) this.j.getValue();
    }

    public final o0e t1() {
        return (o0e) this.f.getValue();
    }

    public final void u1(Uri uri) {
        p1();
        o0e o0eVarT1 = t1();
        mjg mjgVar = o0eVarT1.i;
        Boolean bool = Boolean.TRUE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        sgg sggVarH0 = yab.h0(o0eVarT1.b, ((n0c) o0eVarT1.d).b(), 2, new voc(o0eVarT1, uri, (lq4) null, 20));
        sggVarH0.Y(new bad(o0eVarT1, 1, sggVarH0));
        o0eVarT1.h.B(o0eVarT1, o0e.p[0], sggVarH0);
    }

    public final void v1(String str) {
        if (this.r) {
            return;
        }
        View view = getView();
        if (view != null) {
            p0m.a(view, lt7.CONFIRM);
        }
        this.r = true;
        t1().B(new m1f(str));
    }

    public final void w1() {
        p09 p09Var = this.q;
        if (p09Var != null) {
            p09Var.x();
        }
        lq4 lq4Var = null;
        this.q = null;
        p09 p09Var2 = new p09(getContext());
        p09Var2.n(fh2.c);
        wxl.a();
        if (((Integer) ((y48) p09Var2.i.i).b(y48.b, 0)).intValue() != 0) {
            p09Var2.l(0, Integer.valueOf(p09Var2.i.K()), Integer.valueOf(p09Var2.i.L()), true);
            p09Var2.t(null);
        }
        dne dneVar = new dne(ww6.c, new ene(y), null);
        wxl.a();
        if (p09Var2.d != dneVar) {
            p09Var2.d = dneVar;
            p09Var2.v();
            r48 r48Var = new r48(2);
            p09Var2.c(r48Var, p09Var2.d);
            r48Var.b.m(n68.u0, p09Var2.o);
            igd igdVarB = r48Var.b();
            p09Var2.c = igdVarB;
            hgd hgdVar = p09Var2.t;
            if (hgdVar != null) {
                igdVarB.K(hgdVar);
            }
            p09Var2.t(null);
        }
        this.q = p09Var2;
        int i = 3;
        ((ghd) this.k.m(this, w[3])).setController(p09Var2);
        o1();
        try {
            g19 viewLifecycleOwner = getViewLifecycleOwner();
            wxl.a();
            p09Var2.L = viewLifecycleOwner;
            p09Var2.t(null);
        } catch (IllegalStateException e) {
            gm0.V(QrScannerWidget.class.getName(), "Fail to bindCameraToLifecycle", new a(e));
        }
        wxl.a();
        e9i.j0(new fz6(n1g.v(iyl.a(p09Var2.B), getViewLifecycleOwner().f(), n09.d), new t0e(lq4Var, this, 5), i), getViewLifecycleScope());
    }

    public QrScannerWidget(boolean z, Long l, k0e k0eVar, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("can_select_file", Boolean.valueOf(z)), new ylc("source_id", l), new ylc("mode", k0eVar)));
    }
}
