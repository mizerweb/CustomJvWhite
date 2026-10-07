package one.me.sharedata;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.AutoTransition;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a4c;
import defpackage.acc;
import defpackage.ayb;
import defpackage.ayf;
import defpackage.bb;
import defpackage.br4;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dp4;
import defpackage.dql;
import defpackage.dsc;
import defpackage.dtd;
import defpackage.dwd;
import defpackage.dz9;
import defpackage.dzc;
import defpackage.dzf;
import defpackage.e30;
import defpackage.e9i;
import defpackage.ed6;
import defpackage.euc;
import defpackage.ez9;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gcc;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.h8c;
import defpackage.hcc;
import defpackage.hr4;
import defpackage.hve;
import defpackage.hyf;
import defpackage.i1m;
import defpackage.ifh;
import defpackage.ih;
import defpackage.irf;
import defpackage.iyf;
import defpackage.j11;
import defpackage.j8e;
import defpackage.jc4;
import defpackage.je9;
import defpackage.ju6;
import defpackage.jy5;
import defpackage.jyf;
import defpackage.jz;
import defpackage.kc4;
import defpackage.kz9;
import defpackage.l21;
import defpackage.ln5;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.lve;
import defpackage.m8b;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n5b;
import defpackage.nee;
import defpackage.np4;
import defpackage.ny8;
import defpackage.nz7;
import defpackage.oi8;
import defpackage.ore;
import defpackage.ow0;
import defpackage.oxl;
import defpackage.p;
import defpackage.p90;
import defpackage.py2;
import defpackage.pyc;
import defpackage.pzf;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.r5h;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rs6;
import defpackage.rx8;
import defpackage.t1c;
import defpackage.t3f;
import defpackage.tha;
import defpackage.tnh;
import defpackage.tp2;
import defpackage.tre;
import defpackage.ui9;
import defpackage.uw8;
import defpackage.v09;
import defpackage.v63;
import defpackage.vp4;
import defpackage.vxf;
import defpackage.w8c;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.wxf;
import defpackage.xde;
import defpackage.xnh;
import defpackage.xre;
import defpackage.xw3;
import defpackage.yka;
import defpackage.yl5;
import defpackage.yw1;
import defpackage.z2e;
import defpackage.z5h;
import defpackage.zfe;
import defpackage.zka;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import defpackage.zxb;
import defpackage.zxf;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sharedata.ShareDataPickerScreen;
import ru.ok.tamtam.android.util.share.ShareData;
import ru.ok.tamtam.exception.IssueKeyException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\n\u000bB\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lone/me/sharedata/ShareDataPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lvxf;", "Lmc4;", "Lvp4;", "Ln5b;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "iyf", "a", "share-picker"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ShareDataPickerScreen extends AbstractPickerScreen<vxf> implements mc4, vp4, n5b {
    public static final /* synthetic */ zv8[] C = {new dwd(ShareDataPickerScreen.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), zo5.f(zfe.a, ShareDataPickerScreen.class, "bottomButton", "getBottomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(ShareDataPickerScreen.class, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0)};
    public static final oi8 D = new oi8(0, 4, 0, new j11(4, 3, false), 5);
    public ShareData A;
    public g8c B;
    public final String j;
    public final oi8 k;
    public final mjg l;
    public final wtc m;
    public final boolean n;
    public final ny8 o;
    public final xde p;
    public final AutoTransition q;
    public final ow0 r;
    public final j8e s;
    public final j8e t;
    public final ny8 u;
    public tp2 v;
    public hve w;
    public final jy5 x;
    public kz9 y;
    public boolean z;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/sharedata/ShareDataPickerScreen$a;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "msg", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "share-picker"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends IssueKeyException {
        public a(String str, Throwable th) {
            super("ONEME-29466", str, th);
        }
    }

    public ShareDataPickerScreen(Bundle bundle) {
        super(bundle);
        this.j = ShareDataPickerScreen.class.getName();
        this.k = oi8.e;
        this.l = p90.a(new tnh(R.string.share_search_hint));
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.m = wtcVar;
        this.n = bundle.getBoolean("oneme:share:is:internal:url:sharing");
        this.o = rx8.P(3, new yw1(3, bundle));
        this.p = new xde(wtcVar.getAccessor().d(23), wtcVar.getAccessor().d(144), z1(bundle));
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addTarget(R.id.oneme_picker_quote_view);
        autoTransition.addTarget(R.id.oneme_picker_main_container);
        autoTransition.addTarget(R.id.oneme_picker_input_view);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100L);
        this.q = autoTransition;
        this.r = binding(new hyf(this, 1));
        this.s = viewBinding(R.id.oneme_picker_bottom_button);
        this.t = viewBinding(R.id.oneme_picker_quote_view);
        this.u = createViewModelLazy(ez9.class, new ztd(29, new hyf(this, 2)));
        this.x = new jy5(this, 4);
        this.z = z1(bundle).j();
        this.A = B1(bundle);
        ln5 ln5Var = new ln5(this, new hyf(this, 3));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 16));
        }
    }

    public final tha A1() {
        zv8 zv8Var = C[0];
        return (tha) this.r.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v28 */
    public final ShareData B1(Bundle bundle) throws Throwable {
        ShareData shareData;
        ShareData shareData2;
        CharSequence charSequenceExtra;
        Iterator it;
        int i;
        CharSequence charSequenceExtra2;
        CharSequence charSequenceExtra3;
        ?? r2;
        InputStream inputStreamOpenInputStream;
        String strG;
        ShareData shareData3 = (ShareData) tre.f0(bundle, "share_data", ShareData.class);
        if (shareData3 != null) {
            return shareData3;
        }
        Intent intent = (Intent) ((Parcelable) tre.f0(bundle, "oneme:share:data", Intent.class));
        if (intent != null) {
            wtc wtcVar = this.m;
            Context context = (Context) wtcVar.getAccessor().c(7);
            ed6 ed6Var = (ed6) wtcVar.getAccessor().c(205);
            rs6 rs6Var = (rs6) wtcVar.getAccessor().c(138);
            if (ch3.r(intent.getAction())) {
                shareData = null;
            } else {
                int i2 = 1;
                if ("android.intent.action.SEND".equals(intent.getAction())) {
                    shareData2 = new ShareData();
                    int iC = dql.c(intent);
                    shareData2.type = iC;
                    if (iC == 0) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (stringExtra == null && (charSequenceExtra2 = intent.getCharSequenceExtra("android.intent.extra.TEXT")) != null) {
                            stringExtra = charSequenceExtra2.toString();
                        }
                        shareData2.text = stringExtra;
                    } else if (iC == 1) {
                        shareData2.images = dql.e(intent, context, ed6Var, rs6Var);
                    } else if (iC == 2) {
                        shareData2.videos = dql.e(intent, context, ed6Var, rs6Var);
                    } else if (iC == 4) {
                        shareData2.files = dql.e(intent, context, ed6Var, rs6Var);
                    } else if (iC == 5) {
                        try {
                            try {
                                Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                                if (dp4.a(uri, context.getPackageName())) {
                                    gm0.W("dql", "Blocked incoming vcard with own content provider URI: " + uri, new Object[0]);
                                } else {
                                    if (!l21.k(context, uri)) {
                                        inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                                        try {
                                            strG = oxl.g(inputStreamOpenInputStream);
                                            oxl.d(inputStreamOpenInputStream);
                                        } catch (Exception e) {
                                            e = e;
                                            gm0.W("dql", "handleVcardIntent failed, e: " + e, new Object[0]);
                                            oxl.d(inputStreamOpenInputStream);
                                            strG = null;
                                        }
                                    }
                                    shareData2.vcard = strG;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                inputStreamOpenInputStream = null;
                            } catch (Throwable th) {
                                th = th;
                                r2 = 0;
                                oxl.d(r2);
                                throw th;
                            }
                            strG = null;
                            shareData2.vcard = strG;
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = context;
                            oxl.d(r2);
                            throw th;
                        }
                    }
                    if (shareData2.type != 0 && intent.hasExtra("android.intent.extra.TEXT")) {
                        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
                        if (stringExtra2 == null && (charSequenceExtra3 = intent.getCharSequenceExtra("android.intent.extra.TEXT")) != null) {
                            stringExtra2 = charSequenceExtra3.toString();
                        }
                        shareData2.text = stringExtra2;
                    }
                } else {
                    if (!"android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                        ore.k("shouldn't be here");
                        return null;
                    }
                    shareData2 = new ShareData();
                    int iC2 = dql.c(intent);
                    shareData2.type = iC2;
                    if (iC2 == 1) {
                        shareData2.images = dql.d(intent, context, ed6Var, rs6Var);
                    } else if (iC2 == 2) {
                        shareData2.videos = dql.d(intent, context, ed6Var, rs6Var);
                    } else if (iC2 == 4) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                        if (parcelableArrayListExtra != null) {
                            Iterator it2 = parcelableArrayListExtra.iterator();
                            while (it2.hasNext()) {
                                Uri uriQ = ju6.q((Parcelable) it2.next());
                                if (uriQ != null && !l21.k(context, uriQ)) {
                                    String packageName = context.getPackageName();
                                    if (dp4.a(uriQ, packageName)) {
                                        gm0.W("dql", zo5.l(uriQ, "Blocked incoming multiple share with own content provider URI: "), new Object[0]);
                                        ((t1c) ed6Var).a(new SecurityException(zo5.l(uriQ, "Multiple share with own content provider URI blocked: ")));
                                    } else {
                                        String type = context.getContentResolver().getType(uriQ);
                                        if (type == null) {
                                            String string = uriQ.toString();
                                            if (string == null || string.length() == 0) {
                                                it = it2;
                                            } else {
                                                it = it2;
                                                int iY0 = r5h.Y0(string, '.', 0, 6);
                                                if (iY0 != -1) {
                                                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(string.substring(iY0 + 1).toLowerCase(Locale.ROOT));
                                                    if (mimeTypeFromExtension == null) {
                                                        mimeTypeFromExtension = "*/*";
                                                    }
                                                    type = mimeTypeFromExtension;
                                                }
                                            }
                                            type = null;
                                        } else {
                                            it = it2;
                                        }
                                        if (!dp4.b(uriQ, packageName) && rs6Var != null) {
                                            uriQ = dql.b(uriQ, context, rs6Var);
                                        }
                                        if (type == null || type.length() == 0 || !z5h.K0(type, "image/", true) || r5h.L0(type, "djvu", true)) {
                                            if (type == null || type.length() == 0) {
                                                i = 1;
                                            } else {
                                                i = 1;
                                                if (z5h.K0(type, "video/", true)) {
                                                    arrayList2.add(uriQ);
                                                }
                                            }
                                            gm0.W("dql", qv1.k("partitionMultipleMediaIntent: non-media mime in multi-share: ", type), new Object[0]);
                                            arrayList3.add(uriQ);
                                        } else {
                                            arrayList.add(uriQ);
                                            i = 1;
                                        }
                                        i2 = i;
                                        it2 = it;
                                    }
                                }
                            }
                        }
                        int i3 = i2;
                        shareData2.images = arrayList.isEmpty() ? null : arrayList;
                        shareData2.videos = arrayList2.isEmpty() ? null : arrayList2;
                        shareData2.files = arrayList3.isEmpty() ? null : arrayList3;
                        gm0.n("dql", "partitionMultipleMediaIntent: images=" + arrayList.size() + ", videos=" + arrayList2.size() + ", files=" + arrayList3.size());
                        int i4 = shareData2.images != null ? i3 : 0;
                        int i5 = shareData2.videos != null ? i3 : 0;
                        int i6 = shareData2.files != null ? i3 : 0;
                        if (i4 == 0 || i5 != 0 || i6 != 0) {
                            i3 = (i5 != 0 && i4 == 0 && i6 == 0) ? 2 : 4;
                        }
                        shareData2.type = i3;
                    }
                    if (shareData2.type != 0 && intent.hasExtra("android.intent.extra.TEXT")) {
                        String stringExtra3 = intent.getStringExtra("android.intent.extra.TEXT");
                        if (stringExtra3 == null && (charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT")) != null) {
                            stringExtra3 = charSequenceExtra.toString();
                        }
                        shareData2.text = stringExtra3;
                    }
                }
                shareData = shareData2;
            }
        } else {
            shareData = null;
        }
        return shareData == null ? new ShareData(0, null, null, null, null, null, null, null, 255, null) : shareData;
    }

    public final void C1() {
        if (getView() != null && getArgs().getBoolean("oneme:share:open_story") && !((vxf) x1().d).f()) {
            g8c g8cVar = this.B;
            if (g8cVar != null) {
                g8cVar.a();
            }
            h8c h8cVar = new h8c(this);
            h8cVar.m(new tnh(R.string.share_story_single_media_snackbar));
            h8cVar.h(new w8c(R.drawable.share_in_story));
            this.B = h8cVar.p();
            return;
        }
        String str = this.j;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.q("showSingleMediaSnackbarIfNeeded: skipped, isFromStoryShortcut=", ", shouldShowStoryItem=", getArgs().getBoolean("oneme:share:open_story"), ((vxf) x1().d).f()), null);
        }
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        pzf pzfVar = ((vxf) x1().d).r;
        if (i == R.id.oneme_picker_toolbar_action_select) {
            pzfVar.a(ayf.a);
        } else if (i == R.id.oneme_picker_toolbar_action_cancel_selection) {
            pzfVar.a(zxf.a);
        }
    }

    @Override // defpackage.n5b
    public final void d0(boolean z) {
        if (z == this.z) {
            return;
        }
        this.z = z;
        Widget widgetV1 = v1();
        PickerChatsTabWidget pickerChatsTabWidget = widgetV1 instanceof PickerChatsTabWidget ? (PickerChatsTabWidget) widgetV1 : null;
        if (pickerChatsTabWidget != null) {
            pickerChatsTabWidget.q1(z);
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        vxf vxfVar = (vxf) x1().d;
        if (i == R.id.oneme_picker_confirm_close) {
            vxfVar.r.a(wxf.a);
        } else {
            vxfVar.getClass();
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getK() {
        return this.k;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return tre.E(this, new irf(12), new nz7(getArgs().getString("ref"), 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [br4] */
    @Override // defpackage.br4
    public final boolean handleBack() {
        hve hveVar = this.w;
        if (hveVar != null && hveVar.o()) {
            ((vxf) x1().d).t.a(yka.a);
            return true;
        }
        if (!getArgs().getBoolean("oneme:share:confirm", false) || this.p.r().isEmpty()) {
            return super.handleBack();
        }
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarC = p.c(R.string.share_confirmation_close_title, null, null, 4);
        jc4VarC.a(new kc4(R.id.oneme_picker_confirm_cancel, new tnh(R.string.share_confirm_cancel), 3, true, 3, 4));
        jc4VarC.a(new kc4(R.id.oneme_picker_confirm_close, new tnh(R.string.share_confirm_close), 2, 32));
        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(this);
        confirmationBottomSheetF.setTargetController(this);
        ?? parentController = this;
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
        return true;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable o1() {
        int iOrdinal = ((iyf) this.o.getValue()).ordinal();
        final int i = 0;
        int i2 = 3;
        final int i3 = 1;
        lq4 lq4Var = null;
        n09 n09Var = n09.d;
        if (iOrdinal == 0) {
            cyb cybVar = new cyb(getContext());
            cybVar.setId(R.id.oneme_picker_bottom_button);
            cybVar.setSize(ayb.g);
            cybVar.setAppearance(zxb.GHOST);
            cybVar.setTextColor(Integer.valueOf(R.attr.text_themed));
            cybVar.setText(np4.q(getContext(), R.string.share_bottom_button_copy_link));
            qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: fyf
                public final /* synthetic */ ShareDataPickerScreen b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i3;
                    ShareDataPickerScreen shareDataPickerScreen = this.b;
                    switch (i4) {
                        case 0:
                            zv8[] zv8VarArr = ShareDataPickerScreen.C;
                            ((vxf) shareDataPickerScreen.x1().d).g(null, (m8b) shareDataPickerScreen.x1().i.a.getValue());
                            break;
                        default:
                            zv8[] zv8VarArr2 = ShareDataPickerScreen.C;
                            vxf vxfVar = (vxf) shareDataPickerScreen.x1().d;
                            String str = vxfVar.a.text;
                            if (str != null) {
                                vxfVar.r.a(new yxf(str));
                                break;
                            }
                            break;
                    }
                }
            });
            cybVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            z2e z2eVar = new z2e(getContext());
            z2eVar.setId(R.id.oneme_picker_quote_view);
            z2eVar.setLayoutParams(new LinearLayout.LayoutParams(-1, gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
            e9i.j0(new fz6(n1g.v(((vxf) x1().d).q, getViewLifecycleOwner().f(), n09Var), new jyf((lq4) null, z2eVar, this), i2), getViewLifecycleScope());
            return xw3.P0(cybVar, z2eVar, A1());
        }
        if (iOrdinal != 1) {
            ore.o();
            return null;
        }
        cyb cybVar2 = new cyb(getContext());
        cybVar2.setSize(ayb.g);
        cybVar2.setAppearance(zxb.PRIMARY);
        cybVar2.setText(np4.q(getContext(), R.string.contacts_picker_send_btn_title));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.setMargins(iK, iK, iK, iK);
        cybVar2.setLayoutParams(layoutParams);
        qe7.H(cybVar2, 300L, new View.OnClickListener(this) { // from class: fyf
            public final /* synthetic */ ShareDataPickerScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                ShareDataPickerScreen shareDataPickerScreen = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = ShareDataPickerScreen.C;
                        ((vxf) shareDataPickerScreen.x1().d).g(null, (m8b) shareDataPickerScreen.x1().i.a.getValue());
                        break;
                    default:
                        zv8[] zv8VarArr2 = ShareDataPickerScreen.C;
                        vxf vxfVar = (vxf) shareDataPickerScreen.x1().d;
                        String str = vxfVar.a.text;
                        if (str != null) {
                            vxfVar.r.a(new yxf(str));
                            break;
                        }
                        break;
                }
            }
        });
        e9i.j0(new fz6(n1g.v(x1().i, getViewLifecycleOwner().f(), n09Var), new jyf(lq4Var, this, cybVar2, 4), i2), getViewLifecycleScope());
        return Collections.singletonList(cybVar2);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        if (hr4Var == hr4.e || hr4Var == hr4.c) {
            vxf vxfVar = (vxf) x1().d;
            if (vxfVar.f || vxfVar.d != iyf.DEFAULT) {
                return;
            }
            ((dzf) vxfVar.m.getValue()).a(vxfVar.g, "show", null);
        }
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.v = null;
        this.w = null;
        kz9 kz9Var = this.y;
        if (kz9Var != null) {
            kz9Var.c();
        }
        this.y = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        nee adapter;
        this.A = B1(bundle2);
        vxf vxfVar = (vxf) x1().d;
        ShareData shareData = this.A;
        boolean z = getArgs().getBoolean("oneme:share:open_story");
        vxfVar.a = shareData;
        vxfVar.h = z;
        vxfVar.i();
        if (vxfVar.h && vxfVar.f()) {
            vxfVar.h();
        }
        Widget widgetV1 = v1();
        PickerChatsTabWidget pickerChatsTabWidget = widgetV1 instanceof PickerChatsTabWidget ? (PickerChatsTabWidget) widgetV1 : null;
        if (pickerChatsTabWidget != null) {
            boolean zF = ((vxf) x1().d).f();
            if (pickerChatsTabWidget.getView() != null && (adapter = pickerChatsTabWidget.p1().getAdapter()) != null) {
                int iL = adapter.l();
                for (int i = 0; i < iL; i++) {
                    hve hveVarI = pickerChatsTabWidget.m.I(i);
                    if (hveVarI != null) {
                        br4 br4VarI = rx8.I(hveVarI);
                        PickerChatsListWidget pickerChatsListWidget = br4VarI instanceof PickerChatsListWidget ? (PickerChatsListWidget) br4VarI : null;
                        if (pickerChatsListWidget != null) {
                            qt4.C(zF, pickerChatsListWidget.x1().r, null);
                        }
                    }
                }
            }
        }
        C1();
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        n09 n09Var = n09.d;
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view;
        lq4 lq4Var = null;
        try {
            if (getArgs().getBoolean("oneme:share:open_story")) {
                Context applicationContext = getContext().getApplicationContext();
                applicationContext.getClass();
                ((ShortcutManager) applicationContext.getSystemService(ShortcutManager.class)).reportShortcutUsed("share_story");
                Iterator it = ((ArrayList) n1g.F(applicationContext)).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    Collections.singletonList("share_story");
                    throw null;
                }
            }
        } catch (Exception e) {
            String str = this.j;
            a aVar = new a("share data picker screen from story shortcut report failed", e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "share data picker screen from story shortcut report failed", aVar);
                }
            }
        }
        lvb.H(u1(), D, null);
        iyf iyfVar = (iyf) this.o.getValue();
        iyf iyfVar2 = iyf.DEFAULT;
        int i = 3;
        int i2 = 0;
        if (iyfVar == iyfVar2) {
            tp2 tp2Var = new tp2(viewGroup.getContext());
            tp2Var.setId(R.id.oneme_picker_media_keyboard_container);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            tp2Var.setLayoutParams(layoutParams);
            int i3 = uw8.a;
            tp2Var.setTranslationY(uw8.a(tp2Var.getContext()));
            lvb.H(tp2Var, new oi8(0, 0, 0, new j11(5, 1, false), 7), null);
            this.v = tp2Var;
            this.w = getChildRouter(tp2Var);
            viewGroup.addView(tp2Var);
            e9i.j0(new fz6(n1g.v(x1().i, getViewLifecycleOwner().f(), n09Var), new jyf(lq4Var, this, view, 2), i), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(((vxf) x1().d).s, getViewLifecycleOwner().f(), n09Var), new dtd(lq4Var, this, 28), i), getViewLifecycleScope());
        if (((iyf) this.o.getValue()) == iyfVar2) {
            ViewGroup viewGroupU1 = u1();
            hve hveVar = this.w;
            tp2 tp2Var2 = this.v;
            if (hveVar != null && tp2Var2 != null) {
                hyf hyfVar = new hyf(this, 4);
                boolean z = ((dsc) this.m.getAccessor().c(79)).b && Build.VERSION.SDK_INT >= 30;
                v09 viewLifecycleScope = getViewLifecycleScope();
                zka zkaVar = (zka) ((vxf) x1().d).t.b.a.getValue();
                this.y = new kz9(hveVar, tp2Var2, viewGroupU1, hyfVar, z, viewLifecycleScope, (zkaVar != null ? zkaVar.a : null) == yka.b, null, null, new xre(this, 13, viewGroupU1), 1920);
                new dz9((ez9) this.u.getValue(), A1()).a(getViewLifecycleScope());
                e9i.j0(new fz6(n1g.v(new jz(((vxf) x1().d).t.b, 13), getViewLifecycleOwner().f(), n09Var), new jyf(lq4Var, this, viewGroupU1, i2), i), getViewLifecycleScope());
                r8e r8eVar = ((ez9) this.u.getValue()).h;
                e9i.j0(new e30(new fz6(new jz(r8eVar, 13), new jyf(r8eVar, (lq4) null, this), i), 8), getViewLifecycleScope());
            }
        }
        C1();
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final pyc p1() {
        wtc wtcVar = this.m;
        i1m i1mVar = new i1m(wtcVar.getAccessor().d(144));
        xde xdeVar = this.p;
        return new euc(xdeVar, i1mVar, new ih(wtcVar.getAccessor().d(942), xdeVar, false), 13);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget q1(t3f t3fVar) {
        return new PickerChatsTabWidget(t3fVar, this.z, py2.b, ((vxf) x1().d).f());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final rcc r1(Context context, int i) {
        String string = getArgs().getString("oneme:share:title", null);
        if (string == null) {
            string = context.getString(R.string.share_toolbar_title);
        }
        rcc rccVar = new rcc(context);
        rccVar.setId(i);
        rccVar.setTransitionName(context.getString(R.string.chat_list_toolbar_transition_name));
        rccVar.setTitle(string);
        rccVar.setForm(gcc.Compact);
        final int i2 = 0;
        rccVar.setLeftActions(new wbc(new cf7(this) { // from class: gyf
            public final /* synthetic */ ShareDataPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i2;
                sbi sbiVar = sbi.a;
                ShareDataPickerScreen shareDataPickerScreen = this.b;
                View view = (View) obj;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = ShareDataPickerScreen.C;
                        ltb onBackPressedDispatcher = shareDataPickerScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        break;
                    default:
                        zv8[] zv8VarArr2 = ShareDataPickerScreen.C;
                        opl.b(shareDataPickerScreen, 1).f(view).l(shareDataPickerScreen.z ? Collections.singletonList(new rp4(R.id.oneme_picker_toolbar_action_cancel_selection, new tnh(R.string.share_toolbar_action_cancel_selection), Integer.valueOf(R.drawable.icon_multi_unselect), (Integer) null, 20)) : Collections.singletonList(new rp4(R.id.oneme_picker_toolbar_action_select, new tnh(R.string.share_toolbar_action_select), Integer.valueOf(R.drawable.icon_multi_select), (Integer) null, 20))).b().build().u(shareDataPickerScreen);
                        break;
                }
                return sbiVar;
            }
        }));
        final int i3 = 1;
        rccVar.setRightActions(new acc(null, new hcc(R.drawable.icon_dots_vertical, new cf7(this) { // from class: gyf
            public final /* synthetic */ ShareDataPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i4 = i3;
                sbi sbiVar = sbi.a;
                ShareDataPickerScreen shareDataPickerScreen = this.b;
                View view = (View) obj;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = ShareDataPickerScreen.C;
                        ltb onBackPressedDispatcher = shareDataPickerScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        break;
                    default:
                        zv8[] zv8VarArr2 = ShareDataPickerScreen.C;
                        opl.b(shareDataPickerScreen, 1).f(view).l(shareDataPickerScreen.z ? Collections.singletonList(new rp4(R.id.oneme_picker_toolbar_action_cancel_selection, new tnh(R.string.share_toolbar_action_cancel_selection), Integer.valueOf(R.drawable.icon_multi_unselect), (Integer) null, 20)) : Collections.singletonList(new rp4(R.id.oneme_picker_toolbar_action_select, new tnh(R.string.share_toolbar_action_select), Integer.valueOf(R.drawable.icon_multi_select), (Integer) null, 20))).b().build().u(shareDataPickerScreen);
                        break;
                }
                return sbiVar;
            }
        }), null));
        return rccVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final dzc s1() {
        String string = getArgs().getString("oneme:share:quote:title", null);
        boolean z = getArgs().getBoolean("oneme:share:is:internal:url:sharing", false);
        String string2 = getArgs().getString("ref");
        ShareData shareData = this.A;
        wtc wtcVar = this.m;
        v63 v63Var = new v63(wtcVar.getAccessor().d(318), wtcVar.getAccessor().d(136), wtcVar.getAccessor().d(362), wtcVar.getAccessor().d(213));
        ifh ifhVarD = wtcVar.getAccessor().d(23);
        ifh ifhVarD2 = wtcVar.getAccessor().d(589);
        ifh ifhVarD3 = wtcVar.getAccessor().d(291);
        xnh xnhVar = string != null ? new xnh(string) : null;
        ifh ifhVarD4 = wtcVar.getAccessor().d(18);
        ifh ifhVarD5 = wtcVar.getAccessor().d(1013);
        ifh ifhVarD6 = wtcVar.getAccessor().d(26);
        return new vxf(shareData, v63Var, this.p, ifhVarD, ifhVarD2, ifhVarD3, ifhVarD4, ifhVarD5, wtcVar.getAccessor().d(318), ifhVarD6, (iyf) this.o.getValue(), xnhVar, z, string2, getArgs().getBoolean("oneme:share:open_story"));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final gjg t1() {
        return this.l;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final int w1() {
        return R.id.oneme_picker_toolbar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final void y1() {
        vxf vxfVar = (vxf) x1().d;
        if (vxfVar.f()) {
            vxfVar.h();
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final m8b z1(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        m8b m8bVarH0 = longArray != null ? rx8.h0(longArray) : null;
        return m8bVarH0 == null ? ui9.a : m8bVarH0;
    }
}
