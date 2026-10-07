package one.me.mediaeditor.editandreply;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.bs0;
import defpackage.bwc;
import defpackage.bz5;
import defpackage.c0a;
import defpackage.c1a;
import defpackage.ch3;
import defpackage.col;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.dx4;
import defpackage.dy5;
import defpackage.dz9;
import defpackage.e30;
import defpackage.e9i;
import defpackage.ek7;
import defpackage.ey5;
import defpackage.ez9;
import defpackage.fj3;
import defpackage.fy5;
import defpackage.fz6;
import defpackage.fze;
import defpackage.g8c;
import defpackage.gcc;
import defpackage.gk7;
import defpackage.gm0;
import defpackage.gx4;
import defpackage.gz5;
import defpackage.h;
import defpackage.h8c;
import defpackage.ha9;
import defpackage.hve;
import defpackage.hy5;
import defpackage.i19;
import defpackage.iz5;
import defpackage.j11;
import defpackage.j8e;
import defpackage.je9;
import defpackage.jha;
import defpackage.jvc;
import defpackage.jy5;
import defpackage.jz;
import defpackage.kbc;
import defpackage.ks6;
import defpackage.kz9;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ore;
import defpackage.pq3;
import defpackage.q2f;
import defpackage.qc5;
import defpackage.qe7;
import defpackage.qv1;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.sa3;
import defpackage.suc;
import defpackage.t3f;
import defpackage.tha;
import defpackage.tnh;
import defpackage.tp2;
import defpackage.tre;
import defpackage.ubf;
import defpackage.v09;
import defpackage.vp4;
import defpackage.vuc;
import defpackage.vv;
import defpackage.w8c;
import defpackage.wbc;
import defpackage.wy5;
import defpackage.xc8;
import defpackage.xy5;
import defpackage.xzl;
import defpackage.y26;
import defpackage.y3f;
import defpackage.yka;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw4;
import defpackage.yy5;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zka;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zy5;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import one.me.mediaeditor.editandreply.EditAndReplyScreen;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lone/me/mediaeditor/editandreply/EditAndReplyScreen;", "Lone/me/sdk/arch/Widget;", "Lubf;", "Lz4f;", "Lyw4;", "Lvuc;", "Lvp4;", "Lq2f;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Ldy5;", "editAndReplyArgs", "Lha9;", "localAccountId", "(Ldy5;Lha9;)V", "media-editor"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditAndReplyScreen extends Widget implements ubf, z4f, yw4, vuc, vp4, q2f, mc4 {
    public static final /* synthetic */ zv8[] w = {new dwd(EditAndReplyScreen.class, "replyChatId", "getReplyChatId()J", 0), zo5.f(zfe.a, EditAndReplyScreen.class, "replyMessageLocalId", "getReplyMessageLocalId()J", 0), new dwd(EditAndReplyScreen.class, "sourceUri", "getSourceUri()Landroid/net/Uri;", 0), new dwd(EditAndReplyScreen.class, "photoView", "getPhotoView()Lone/me/chatmedia/viewer/photo/PhotoView;", 0), new dwd(EditAndReplyScreen.class, "loadingView", "getLoadingView()Landroid/widget/ImageView;", 0), new dwd(EditAndReplyScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(EditAndReplyScreen.class, "messageInput", "getMessageInput()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new dwd(EditAndReplyScreen.class, "bottomContainer", "getBottomContainer()Landroid/widget/LinearLayout;", 0), new dwd(EditAndReplyScreen.class, "editActionsRow", "getEditActionsRow()Landroid/widget/LinearLayout;", 0), new dwd(EditAndReplyScreen.class, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(EditAndReplyScreen.class, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0)};
    public final vv a;
    public final vv b;
    public final vv c;
    public final t3f d;
    public final h e;
    public Uri f;
    public boolean g;
    public final ny8 h;
    public final ks6 i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public final j8e o;
    public ValueAnimator p;
    public final j8e q;
    public final j8e r;
    public kz9 s;
    public final ny8 t;
    public g8c u;
    public final jy5 v;

    public EditAndReplyScreen(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.a = new vv("reply_chat_id", cls);
        this.b = new vv("reply_message_local_id", cls);
        this.c = new vv("source_uri", Uri.class);
        this.d = new t3f("EditAndReplyScreen", super.getD().b());
        this.e = new h(m35getAccountScopeuqN4xOY());
        this.h = createViewModelLazy(iz5.class, new fj3(17, new fy5(this, 1)));
        this.i = tre.F(this, y3f.MEDIA_PREVIEW_WITHOUT_SAVING);
        this.j = viewBinding(R.id.edit_and_reply_photo_view_id);
        this.k = viewBinding(R.id.edit_and_reply_loading_id);
        this.l = viewBinding(R.id.edit_and_reply_toolbar_id);
        this.m = viewBinding(R.id.edit_and_reply_message_input_id);
        this.n = viewBinding(R.id.edit_and_reply_bottom_container_id);
        this.o = viewBinding(R.id.edit_and_reply_actions_row_id);
        this.q = viewBinding(R.id.edit_and_reply_media_keyboard_container_id);
        this.r = Widget.childRouter$default(this, R.id.edit_and_reply_media_keyboard_container_id, null, 2, null);
        this.t = createViewModelLazy(ez9.class, new fj3(18, new fy5(this, 2)));
        this.v = new jy5(this, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    @Override // defpackage.yw4
    public final void A0(suc sucVar) {
        String strK;
        int length;
        iz5 iz5VarT1 = t1();
        String str = iz5VarT1.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                Object obj = sucVar.c;
                if (gm0.c()) {
                    strK = obj.toString();
                } else if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    if (collection.isEmpty()) {
                        strK = "[]";
                    } else {
                        length = collection.size();
                        strK = c0a.k(length, "[**", "**]");
                    }
                } else if (obj instanceof Map) {
                    Map map = (Map) obj;
                    strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
                } else if (obj instanceof Object[]) {
                    Object[] objArr = (Object[]) obj;
                    if (objArr.length == 0) {
                        strK = "[]";
                    } else {
                        length = objArr.length;
                        strK = c0a.k(length, "[**", "**]");
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr.length == 0) {
                        strK = "[]";
                    } else {
                        length = iArr.length;
                        strK = c0a.k(length, "[**", "**]");
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    if (fArr.length == 0) {
                        strK = "[]";
                    } else {
                        length = fArr.length;
                        strK = c0a.k(length, "[**", "**]");
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr.length == 0) {
                        strK = "[]";
                    } else {
                        length = jArr.length;
                        strK = c0a.k(length, "[**", "**]");
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    if (dArr.length == 0) {
                        strK = "[]";
                    } else {
                        length = dArr.length;
                        strK = c0a.k(length, "[**", "**]");
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    if (sArr.length == 0) {
                        strK = "[]";
                    } else {
                        length = sArr.length;
                        strK = c0a.k(length, "[**", "**]");
                    }
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr.length == 0) {
                        strK = "[]";
                    } else {
                        length = bArr.length;
                        strK = c0a.k(length, "[**", "**]");
                    }
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    if (cArr.length == 0) {
                        strK = "[]";
                    } else {
                        length = cArr.length;
                        strK = c0a.k(length, "[**", "**]");
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr.length == 0) {
                        strK = "[]";
                    } else {
                        length = zArr.length;
                        strK = c0a.k(length, "[**", "**]");
                    }
                } else {
                    strK = "***";
                }
                a4cVar.c(je9Var, str, qv1.k("onCropResult: ", strK), null);
            }
        }
        zy5 zy5Var = (zy5) iz5VarT1.v.getValue();
        if (!(zy5Var instanceof xy5)) {
            if (zy5Var instanceof wy5) {
                iz5VarT1.F(sucVar.c);
            } else if (!(zy5Var instanceof yy5)) {
                ore.o();
                return;
            } else if (!((yy5) zy5Var).b) {
                iz5VarT1.F(sucVar.c);
            }
        }
        c1a.b.b().f();
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        if (i == R.id.send_context_menu_action_scheduled_send) {
            iz5 iz5VarT1 = t1();
            je9 je9Var = je9.d;
            String str = iz5VarT1.d;
            a4c a4cVar = gm0.f;
            lq4 lq4Var = null;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onSendScheduledClicked", null);
            }
            Object value = iz5VarT1.v.getValue();
            yy5 yy5Var = value instanceof yy5 ? (yy5) value : null;
            if (yy5Var == null) {
                String str2 = iz5VarT1.d;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 == null) {
                    return;
                }
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "onSendScheduledClicked: called with no State.ResultPreview", null);
                    return;
                }
                return;
            }
            if (!yy5Var.b) {
                iz5VarT1.s.B(iz5VarT1, iz5.B[3], a8j.t(iz5VarT1, null, new gz5(iz5VarT1, lq4Var, 3), 1));
                return;
            }
            String str3 = iz5VarT1.d;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str3, "onSendScheduledClicked: is already sending", null);
            }
        }
    }

    @Override // defpackage.z4f
    public final Integer L() {
        return Integer.valueOf(s1().b().d);
    }

    @Override // defpackage.z4f
    public final Integer R() {
        return Integer.valueOf(s1().b().d);
    }

    @Override // defpackage.vuc
    public final Object V0(jvc jvcVar) {
        return t1().N(jvcVar);
    }

    @Override // defpackage.yw4
    public final Object Z(gx4 gx4Var) {
        return t1().N(gx4Var);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        Uri uri;
        if (i == R.id.media_editor_exit_confirm_id) {
            iz5 iz5VarT1 = t1();
            String str = iz5VarT1.d;
            a4c a4cVar = gm0.f;
            lq4 lq4Var = null;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "onCloseConfirmationClick", null);
                }
            }
            Object value = iz5VarT1.v.getValue();
            yy5 yy5Var = value instanceof yy5 ? (yy5) value : null;
            if (yy5Var != null && (uri = yy5Var.a) != null) {
                a8j.t(iz5VarT1, null, new bz5(iz5VarT1, uri, lq4Var, 0), 3);
                return;
            }
            String str2 = iz5VarT1.d;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                return;
            }
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, "onCloseConfirmationClick: called with no State.ResultPreview", null);
            }
        }
    }

    @Override // defpackage.q2f
    public final void g(long j, long j2) {
        t1().K(r1().getText(), Long.valueOf(j2));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getE() {
        return ch3.o(getContext()).a() ? oi8.a(oi8.f, 7) : oi8.f;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getD() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.i;
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        t1().I();
        return true;
    }

    public final void o1(ViewGroup viewGroup) {
        if (ch3.o(getContext()).a()) {
            int i = 0;
            lvb.H(viewGroup, new oi8(i, 0, 0, new j11(4, 2, true), 7), null);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(s1().b().c);
        bwc bwcVar = new bwc(frameLayout.getContext());
        bwcVar.setId(R.id.edit_and_reply_photo_view_id);
        bwcVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        final int i = 1;
        bwcVar.setZoomEnabled(true);
        frameLayout.addView(bwcVar);
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setId(R.id.edit_and_reply_loading_id);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density), 17));
        xc8 xc8Var = new xc8(imageView.getContext());
        s1();
        xc8Var.setTint(-1);
        imageView.setImageDrawable(xc8Var);
        imageView.setVisibility(8);
        frameLayout.addView(imageView);
        rcc rccVar = new rcc(frameLayout.getContext());
        rccVar.setId(R.id.edit_and_reply_toolbar_id);
        rccVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        rccVar.setForm(gcc.Compact);
        rccVar.setCustomTheme(s1());
        final int i2 = 0;
        rccVar.setLeftActions(new wbc(new ey5(this, i2)));
        rccVar.setBackgroundColor(R().intValue());
        frameLayout.addView(rccVar);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setId(R.id.edit_and_reply_bottom_container_id);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        linearLayout.setGravity(1);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setId(R.id.edit_and_reply_actions_row_id);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setGravity(17);
        linearLayout2.setBackgroundColor(s1().b().d);
        final ImageView imageView2 = new ImageView(linearLayout2.getContext());
        imageView2.setId(R.id.edit_and_reply_crop_action_id);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(yl5.d().getDisplayMetrics().density * 48.0f));
        layoutParams.gravity = 17;
        layoutParams.setMarginEnd(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        imageView2.setPadding(iK, iK, iK, iK);
        imageView2.setLayoutParams(layoutParams);
        int i3 = ((bs0) s1().u().c.g).c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        s1();
        paint.setColor(-1);
        imageView2.setBackground(col.b(i3, null, shapeDrawable));
        imageView2.setImageResource(R.drawable.icon_crop);
        s1();
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
        qe7.H(imageView2, 300L, new View.OnClickListener() { // from class: gy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Uri uri;
                Uri uri2;
                switch (i2) {
                    case 0:
                        ImageView imageView3 = imageView2;
                        EditAndReplyScreen editAndReplyScreen = this;
                        zv8[] zv8VarArr = EditAndReplyScreen.w;
                        p0m.a(imageView3, kt7.CLOCK_TICK);
                        iz5 iz5VarT1 = editAndReplyScreen.t1();
                        String str = iz5VarT1.d;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "onCropClicked", null);
                            }
                        }
                        zy5 zy5Var = (zy5) iz5VarT1.v.getValue();
                        if (!(zy5Var instanceof xy5)) {
                            if (zy5Var instanceof wy5) {
                                uri = ((wy5) zy5Var).a;
                            } else if (!(zy5Var instanceof yy5)) {
                                ore.o();
                            } else {
                                yy5 yy5Var = (yy5) zy5Var;
                                if (!yy5Var.b) {
                                    uri = yy5Var.a;
                                }
                            }
                            iz5VarT1.L(uri);
                        }
                        break;
                    default:
                        ImageView imageView4 = imageView2;
                        EditAndReplyScreen editAndReplyScreen2 = this;
                        zv8[] zv8VarArr2 = EditAndReplyScreen.w;
                        p0m.a(imageView4, kt7.CLOCK_TICK);
                        iz5 iz5VarT2 = editAndReplyScreen2.t1();
                        String str2 = iz5VarT2.d;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.d;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str2, "onDrawClicked", null);
                            }
                        }
                        zy5 zy5Var2 = (zy5) iz5VarT2.v.getValue();
                        if (!(zy5Var2 instanceof xy5)) {
                            if (zy5Var2 instanceof wy5) {
                                uri2 = ((wy5) zy5Var2).a;
                            } else if (!(zy5Var2 instanceof yy5)) {
                                ore.o();
                            } else {
                                yy5 yy5Var2 = (yy5) zy5Var2;
                                if (!yy5Var2.b) {
                                    uri2 = yy5Var2.a;
                                }
                            }
                            iz5VarT2.M(uri2);
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2);
        final ImageView imageView3 = new ImageView(linearLayout2.getContext());
        imageView3.setId(R.id.edit_and_reply_draw_action_id);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(yl5.d().getDisplayMetrics().density * 48.0f));
        layoutParams2.gravity = 17;
        int iK2 = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        imageView3.setPadding(iK2, iK2, iK2, iK2);
        imageView3.setLayoutParams(layoutParams2);
        int i4 = ((bs0) s1().u().c.g).c;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        Paint paint2 = shapeDrawable2.getPaint();
        s1();
        paint2.setColor(-1);
        imageView3.setBackground(col.b(i4, null, shapeDrawable2));
        imageView3.setImageResource(R.drawable.icon_paint);
        s1();
        imageView3.setImageTintList(ColorStateList.valueOf(-1));
        qe7.H(imageView3, 300L, new View.OnClickListener() { // from class: gy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Uri uri;
                Uri uri2;
                switch (i) {
                    case 0:
                        ImageView imageView4 = imageView3;
                        EditAndReplyScreen editAndReplyScreen = this;
                        zv8[] zv8VarArr = EditAndReplyScreen.w;
                        p0m.a(imageView4, kt7.CLOCK_TICK);
                        iz5 iz5VarT1 = editAndReplyScreen.t1();
                        String str = iz5VarT1.d;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "onCropClicked", null);
                            }
                        }
                        zy5 zy5Var = (zy5) iz5VarT1.v.getValue();
                        if (!(zy5Var instanceof xy5)) {
                            if (zy5Var instanceof wy5) {
                                uri = ((wy5) zy5Var).a;
                            } else if (!(zy5Var instanceof yy5)) {
                                ore.o();
                            } else {
                                yy5 yy5Var = (yy5) zy5Var;
                                if (!yy5Var.b) {
                                    uri = yy5Var.a;
                                }
                            }
                            iz5VarT1.L(uri);
                        }
                        break;
                    default:
                        ImageView imageView5 = imageView3;
                        EditAndReplyScreen editAndReplyScreen2 = this;
                        zv8[] zv8VarArr2 = EditAndReplyScreen.w;
                        p0m.a(imageView5, kt7.CLOCK_TICK);
                        iz5 iz5VarT2 = editAndReplyScreen2.t1();
                        String str2 = iz5VarT2.d;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.d;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str2, "onDrawClicked", null);
                            }
                        }
                        zy5 zy5Var2 = (zy5) iz5VarT2.v.getValue();
                        if (!(zy5Var2 instanceof xy5)) {
                            if (zy5Var2 instanceof wy5) {
                                uri2 = ((wy5) zy5Var2).a;
                            } else if (!(zy5Var2 instanceof yy5)) {
                                ore.o();
                            } else {
                                yy5 yy5Var2 = (yy5) zy5Var2;
                                if (!yy5Var2.b) {
                                    uri2 = yy5Var2.a;
                                }
                            }
                            iz5VarT2.M(uri2);
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView3);
        linearLayout.addView(linearLayout2);
        tha thaVar = new tha(linearLayout.getContext());
        thaVar.setId(R.id.edit_and_reply_message_input_id);
        thaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        thaVar.setCustomTheme(s1());
        thaVar.setSendIconResId(R.drawable.icon_arrow_up);
        thaVar.setBackgroundColor(s1().b().d);
        thaVar.setRightOuterIconActionState(jha.a);
        thaVar.setInputHint(R.string.message_hint);
        thaVar.setRightOuterIconTouchListener(new ek7(new GestureDetector(thaVar.getContext(), new gk7(new dx4(thaVar, 3, this), i2, new fy5(this, 5))), 0));
        thaVar.setLeftInnerIconTouchListener(xzl.a(thaVar.getContext(), new fy5(this, i2)));
        linearLayout.addView(thaVar);
        o1(linearLayout);
        frameLayout.addView(linearLayout);
        View tp2Var = new tp2(frameLayout.getContext());
        tp2Var.setId(R.id.edit_and_reply_media_keyboard_container_id);
        tp2Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        if (ch3.o(getContext()).a()) {
            int i5 = 0;
            lvb.H(tp2Var, new oi8(i5, 0, 0, new j11(5, 1, true), 7), new ey5(this, i));
        }
        frameLayout.addView(tp2Var);
        ViewGroup frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        frameLayout2.setBackgroundColor(s1().b().d);
        o1(frameLayout2);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.p = null;
        kz9 kz9Var = this.s;
        if (kz9Var != null) {
            kz9Var.c();
        }
        this.s = null;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        String string = bundle.getString("photo_uri");
        this.f = string != null ? Uri.parse(string) : null;
        this.g = bundle.getBoolean("is_initial_editing");
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onSaveInstanceState(Bundle bundle) {
        Uri uri;
        super.onSaveInstanceState(bundle);
        zy5 zy5Var = (zy5) t1().v.getValue();
        if (zy5Var instanceof xy5) {
            uri = null;
        } else if (zy5Var instanceof wy5) {
            uri = ((wy5) zy5Var).a;
        } else {
            if (!(zy5Var instanceof yy5)) {
                ore.o();
                return;
            }
            uri = ((yy5) zy5Var).a;
        }
        if (uri != null) {
            bundle.putString("photo_uri", uri.toString());
        }
        bundle.putBoolean("is_initial_editing", t1().v.getValue() instanceof wy5);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        r8e r8eVar = t1().w;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new hy5(lq4Var, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().y, getViewLifecycleOwner().f(), n09Var), new hy5(lq4Var, this, i), i), getViewLifecycleScope());
        int i2 = 4;
        e9i.j0(new fz6(n1g.v(t1().A, getViewLifecycleOwner().f(), n09Var), new hy5(lq4Var, this, i2), i), getViewLifecycleScope());
        zv8[] zv8VarArr = w;
        hve hveVar = (hve) this.r.m(this, zv8VarArr[10]);
        tp2 tp2Var = (tp2) this.q.m(this, zv8VarArr[9]);
        LinearLayout linearLayoutP1 = p1();
        fy5 fy5Var = new fy5(this, i);
        boolean zA = ch3.o(getContext()).a();
        v09 viewLifecycleScope = getViewLifecycleScope();
        zka zkaVar = (zka) t1().u.b.a.getValue();
        int i3 = 0;
        boolean z = (zkaVar != null ? zkaVar.a : null) == yka.b;
        ny8 ny8Var = this.t;
        this.s = new kz9(hveVar, tp2Var, linearLayoutP1, fy5Var, zA, viewLifecycleScope, z, new sa3(0, (ez9) ny8Var.getValue()), null, new fy5(this, i2), 1792);
        new dz9((ez9) ny8Var.getValue(), r1()).a(getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(t1().u.b, 13), getViewLifecycleOwner().f(), n09Var), new hy5(lq4Var, this, i3), 3), getViewLifecycleScope());
        r8e r8eVar2 = ((ez9) ny8Var.getValue()).h;
        e9i.j0(new e30(new fz6(new jz(r8eVar2, 13), new fze(r8eVar2, lq4Var, this, 27), 3), i2), getViewLifecycleScope());
    }

    public final LinearLayout p1() {
        return (LinearLayout) this.n.m(this, w[7]);
    }

    public final LinearLayout q1() {
        return (LinearLayout) this.o.m(this, w[8]);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vuc
    public final void r(Uri uri, y26 y26Var) {
        String strK;
        iz5 iz5VarT1 = t1();
        String str = iz5VarT1.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                if (gm0.c()) {
                    strK = uri.toString();
                } else if (uri instanceof Collection) {
                    Collection collection = (Collection) uri;
                    if (collection.isEmpty()) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(collection.size(), "[**", "**]");
                    }
                } else if (uri instanceof Map) {
                    Map map = (Map) uri;
                    strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
                } else if (uri instanceof Object[]) {
                    Object[] objArr = (Object[]) uri;
                    if (objArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(objArr.length, "[**", "**]");
                    }
                } else if (uri instanceof int[]) {
                    int[] iArr = (int[]) uri;
                    if (iArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(iArr.length, "[**", "**]");
                    }
                } else if (uri instanceof float[]) {
                    float[] fArr = (float[]) uri;
                    if (fArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(fArr.length, "[**", "**]");
                    }
                } else if (uri instanceof long[]) {
                    long[] jArr = (long[]) uri;
                    if (jArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(jArr.length, "[**", "**]");
                    }
                } else if (uri instanceof double[]) {
                    double[] dArr = (double[]) uri;
                    if (dArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(dArr.length, "[**", "**]");
                    }
                } else if (uri instanceof short[]) {
                    short[] sArr = (short[]) uri;
                    if (sArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(sArr.length, "[**", "**]");
                    }
                } else if (uri instanceof byte[]) {
                    byte[] bArr = (byte[]) uri;
                    if (bArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(bArr.length, "[**", "**]");
                    }
                } else if (uri instanceof char[]) {
                    char[] cArr = (char[]) uri;
                    if (cArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(cArr.length, "[**", "**]");
                    }
                } else if (uri instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) uri;
                    if (zArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(zArr.length, "[**", "**]");
                    }
                } else {
                    strK = "***";
                }
                a4cVar.c(je9Var, str, qv1.k("onPhotoEditResult: ", strK), null);
            }
        }
        zy5 zy5Var = (zy5) iz5VarT1.v.getValue();
        if (zy5Var instanceof xy5) {
            return;
        }
        if (zy5Var instanceof wy5) {
            iz5VarT1.F(uri);
        } else if (!(zy5Var instanceof yy5)) {
            ore.o();
        } else {
            if (((yy5) zy5Var).b) {
                return;
            }
            iz5VarT1.F(uri);
        }
    }

    public final tha r1() {
        return (tha) this.m.m(this, w[6]);
    }

    public final kbc s1() {
        return pq3.j.e(getContext()).j().b;
    }

    public final iz5 t1() {
        return (iz5) this.h.getValue();
    }

    public final void u1() {
        g8c g8cVar = this.u;
        if (g8cVar != null) {
            g8cVar.a();
        }
        h8c h8cVar = new h8c(this);
        h8cVar.m(new tnh(R.string.common_error));
        h8cVar.h(new w8c(R.drawable.icon_warning_fill));
        this.u = h8cVar.p();
    }

    @Override // defpackage.vuc
    public final void y() {
        iz5 iz5VarT1 = t1();
        mjg mjgVar = iz5VarT1.v;
        zy5 zy5Var = (zy5) mjgVar.getValue();
        if (zy5Var instanceof wy5) {
            wy5 wy5Var = (wy5) zy5Var;
            a8j.t(iz5VarT1, null, new qc5(iz5VarT1, wy5Var, (lq4) null, 6), 3);
            mjgVar.j(null, new wy5(wy5Var.a, true));
            return;
        }
        if ((zy5Var instanceof xy5) || (zy5Var instanceof yy5)) {
            return;
        }
        ore.o();
    }

    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        return t1().N(lq4Var);
    }

    public EditAndReplyScreen(dy5 dy5Var, ha9 ha9Var) {
        this(n1g.i(new ylc("reply_chat_id", Long.valueOf(dy5Var.a)), new ylc("reply_message_local_id", Long.valueOf(dy5Var.b)), new ylc("source_uri", dy5Var.c), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
