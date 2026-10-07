package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class gnh extends ViewGroup implements khf, v35, hnh, cw7, kfa, b8e, mia, ekc, fhf, k24, azf, i59, z7g, jp5 {
    public static final /* synthetic */ zv8[] r;
    public final p6e a;
    public final gia b;
    public final fkc c;
    public final dhf d;
    public final i24 e;
    public final vyf f;
    public final t5d g;
    public final lhf h;
    public final dka i;
    public final u35 j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public zs3 o;
    public af7 p;
    public af7 q;

    static {
        z8b z8bVar = new z8b(gnh.class, "isChannelMode", "isChannelMode$message_list()Z");
        zfe.a.getClass();
        r = new zv8[]{z8bVar};
    }

    public gnh(Context context) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        fkc fkcVar = new fkc();
        dhf dhfVar = new dhf();
        i24 i24Var = new i24(1);
        vyf vyfVar = new vyf();
        super(context);
        this.a = p6eVar;
        this.b = giaVar;
        this.c = fkcVar;
        this.d = dhfVar;
        this.e = i24Var;
        this.f = vyfVar;
        this.g = new t5d(this);
        this.h = new lhf(this);
        dka dkaVar = new dka(context);
        dkaVar.setId(R.id.messages_list_item_text);
        this.i = dkaVar;
        u35 u35Var = new u35(context);
        this.j = u35Var;
        this.k = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        this.l = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        this.m = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.n = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        p6eVar.a = this;
        giaVar.a = this;
        dhfVar.a = this;
        i24Var.a = this;
        vyfVar.a = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(dkaVar, new ViewGroup.LayoutParams(-2, -2));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
        xr8 xr8Var = fea.u;
        kbc kbcVarH = pq3.j.h(this);
        xr8Var.getClass();
        setBackground(xr8.j(kbcVarH));
        setWillNotDraw(false);
        dkaVar.setSingleClickAction(new fnh(this, 1));
        dkaVar.setOnDoubleClickListener(new ptf(18, this));
        dkaVar.setOnLongClickListener(new cw0(11, this));
        dkaVar.setLinkLongClickListener(new vog(this));
    }

    @Override // defpackage.mia
    public final void A() {
        this.b.A();
    }

    @Override // defpackage.azf
    public final void C() {
        this.f.C();
    }

    @Override // defpackage.b8e
    public final void G(xac xacVar, boolean z) {
        this.a.G(xacVar, z);
    }

    public void K(xac xacVar) {
        int i = xacVar.b.g;
        u35 u35Var = this.j;
        u35Var.setTextColor$message_list(i);
        u35Var.setDateViewStatusColor(i);
    }

    public void L(kbc kbcVar) {
        this.j.setBackgroundColor(kbcVar.t().b);
    }

    @Override // defpackage.azf
    public final float b(int i) {
        return this.f.b(i);
    }

    @Override // defpackage.cw7
    public final void d(List list, qf7 qf7Var) {
        CharSequence text = getText();
        if (text == null) {
            return;
        }
        List list2 = list;
        dka dkaVar = this.i;
        if (list2 == null || list2.isEmpty() || qf7Var == null) {
            dka.f(dkaVar);
        } else {
            dkaVar.h((List) qf7Var.invoke(text.toString(), list));
        }
    }

    @Override // defpackage.v35
    public void e(CharSequence charSequence, boolean z) {
        this.j.d(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.d.Z();
    }

    public final i24 getCommentsEntryDelegate() {
        return this.e;
    }

    public final int getContentHorizontalPadding$message_list() {
        return this.l;
    }

    public final int getContentTopPadding$message_list() {
        return this.k;
    }

    public final u35 getDate$message_list() {
        return this.j;
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final gia getMessageLinkDelegate() {
        return this.b;
    }

    public final dka getMessageTextView$message_list() {
        return this.i;
    }

    public af7 getOnDoubleTap() {
        return this.q;
    }

    public zs3 getOnLinkLongClickListener() {
        return this.o;
    }

    public af7 getOnSingleClick() {
        return this.p;
    }

    public final p6e getReactionsDelegate() {
        return this.a;
    }

    public final dhf getSenderAliasDelegate() {
        return this.d;
    }

    public final int getSenderBottomMargin$message_list() {
        return this.m;
    }

    public final lhf getSenderNameViewStub$message_list() {
        return this.h;
    }

    public final vyf getShareMessageDelegate() {
        return this.f;
    }

    public final int getStatusBottomMargin$message_list() {
        return this.n;
    }

    public final CharSequence getText() {
        return this.i.getText();
    }

    @Override // defpackage.k24
    public final void h(int i) {
        this.e.h(i);
    }

    @Override // defpackage.k24
    public final boolean k() {
        return this.e.k();
    }

    @Override // defpackage.b8e
    public final void m(boolean z) {
        this.a.m(z);
    }

    @Override // defpackage.k24
    public final void o() {
        this.e.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iE;
        int i5 = (int) ((fea) getBackground()).s;
        lhf lhfVar = this.h;
        boolean zO = n7j.o(lhfVar.b);
        int i6 = this.l;
        int i7 = this.k;
        if (zO) {
            lhfVar.c(i6, i7);
            iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, lhfVar.a(), i7);
        } else {
            iE = i7;
        }
        dhf dhfVar = this.d;
        if (n7j.o((ny8) dhfVar.b) && n7j.o(lhfVar.b)) {
            dhfVar.T(((getMeasuredWidth() - i6) - dhfVar.L()) - i5, ((lhfVar.a() / 2) - (dhfVar.K() / 2)) + i7);
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.T(i6, iE);
            iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, giaVar.K(), iE);
        }
        dka dkaVar = this.i;
        qyj.M(dkaVar, i6, iE, 0, 12);
        int measuredHeight = dkaVar.getMeasuredHeight() + iE;
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.T(i6, gm0.K(8.0f * yl5.d().getDisplayMetrics().density) + measuredHeight);
            p6eVar.K();
        }
        i24 i24Var = this.e;
        int iK = n7j.o((ny8) i24Var.b) ? i24Var.K() : 0;
        int measuredWidth = getMeasuredWidth();
        u35 u35Var = this.j;
        qyj.M(u35Var, ((measuredWidth - u35Var.getMeasuredWidth()) - i6) - i5, zo5.D(4.0f, yl5.d().getDisplayMetrics().density, (getMeasuredHeight() - iK) - u35Var.getMeasuredHeight()), 0, 12);
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.T(0, getMeasuredHeight() - i24Var.K());
        }
        vyf vyfVar = this.f;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(getMeasuredWidth() - vyfVar.L(), zo5.D(6.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight()) - vyfVar.K());
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0146  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iF = r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        dka dkaVar = this.i;
        dkaVar.j();
        int iMax = getDependOnOutsideView() ? Math.max(iF, dkaVar.getMeasuredWidth()) : dkaVar.getMeasuredWidth();
        int measuredHeight = dkaVar.getMeasuredHeight();
        dhf dhfVar = this.d;
        boolean zO = n7j.o((ny8) dhfVar.b);
        lhf lhfVar = this.h;
        if (zO && n7j.o(lhfVar.b)) {
            dhfVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, dhfVar.L());
        }
        if (n7j.o(lhfVar.b)) {
            lhfVar.d(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, lhfVar.b() + dhfVar.Z());
            measuredHeight = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, lhfVar.a(), measuredHeight);
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, giaVar.L());
            measuredHeight = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, giaVar.K(), measuredHeight);
        }
        p6e p6eVar = this.a;
        ny8 ny8Var = (ny8) p6eVar.b;
        ny8 ny8Var2 = (ny8) p6eVar.b;
        if (n7j.o(ny8Var)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, p6eVar.L());
            measuredHeight = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), measuredHeight);
        }
        u35 u35Var = this.j;
        u35Var.measure(i, i2);
        int iL = n7j.o(ny8Var2) ? p6eVar.L() : dkaVar.e(iF);
        boolean z = !n7j.o(ny8Var2) && dkaVar.i();
        int iB = zo5.b(10.0f, yl5.d().getDisplayMetrics().density, u35Var.getMeasuredWidth() + zo5.b(6.0f, yl5.d().getDisplayMetrics().density, iL));
        if (iB >= iF || z) {
            measuredHeight = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, measuredHeight);
        } else {
            zv8 zv8Var = r[0];
            if (((Boolean) this.g.b).booleanValue()) {
                measuredHeight = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, measuredHeight);
            } else {
                iMax = Math.max(iMax, iB);
            }
        }
        int iG = bc1.g(10.0f, yl5.d().getDisplayMetrics().density, 2, Math.max(iMax, u35Var.getMeasuredWidth()));
        int iE = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, gm0.K(8.0f * yl5.d().getDisplayMetrics().density), measuredHeight);
        i24 i24Var = this.e;
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iG = Math.max(iG, i24Var.L());
            i24Var.U(View.MeasureSpec.makeMeasureSpec(iG, 1073741824), i2);
            iE += i24Var.K();
        }
        vyf vyfVar = this.f;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            int iL2 = vyfVar.L();
            iG += iL2;
            ((fea) getBackground()).s = iL2;
        } else {
            ((fea) getBackground()).s = 0.0f;
        }
        setMeasuredDimension(iG, iE);
    }

    @Override // defpackage.mia
    public final void p(xac xacVar) {
        this.b.p(xacVar);
    }

    @Override // defpackage.i59
    public boolean r() {
        if (n7j.o((ny8) this.b.b)) {
            return false;
        }
        CharSequence text = getText();
        if (!(text instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) text;
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if ((obj instanceof k59) || (obj instanceof n59)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != 1) {
            return false;
        }
        Object objR1 = ww3.r1(arrayList);
        return spanned.getSpanStart(objR1) == 0 && spanned.getSpanEnd(objR1) == spanned.length();
    }

    @Override // defpackage.fhf
    public void setAlias(Layout layout) {
        this.d.setAlias(layout);
    }

    @Override // defpackage.fhf
    public void setAliasColor(int i) {
        this.d.setAliasColor(i);
    }

    public final void setChannelMode$message_list(boolean z) {
        this.g.B(this, r[0], Boolean.valueOf(z));
    }

    @Override // defpackage.b8e
    public void setChipObserver(t5e t5eVar) {
        this.a.setChipObserver(t5eVar);
    }

    @Override // defpackage.k24
    public void setCommentCompactShareProgress(float f) {
        this.e.setCommentCompactShareProgress(f);
    }

    @Override // defpackage.v35
    public void setCountView(CharSequence charSequence) {
        this.j.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.j.setStatus$message_list(f9jVar);
    }

    @Override // defpackage.ekc
    public void setDependOnOutsideView(boolean z) {
        this.c.a = z;
    }

    public void setForceIfFloating(boolean z) {
        this.b.Z(z);
    }

    @Override // defpackage.mia
    public void setForwardClickListener(qf7 qf7Var) {
        this.b.d = qf7Var;
    }

    @Override // defpackage.v35
    public void setIsChannelMode(boolean z) {
        setChannelMode$message_list(z);
        this.j.setChannelMode$message_list(z);
    }

    @Override // defpackage.b8e
    public void setIsIncoming(boolean z) {
        this.a.c = z;
    }

    @Override // defpackage.mia
    public void setLink(fia fiaVar) {
        this.b.setLink(fiaVar);
    }

    public final void setMaxHeightForClip(int i) {
        this.i.setMaxHeightForClip(i);
    }

    @Override // defpackage.b8e
    public void setMaxReactionsCount(int i) {
        this.a.f = i;
    }

    @Override // defpackage.b8e
    public void setOnClickListener(cf7 cf7Var) {
        this.a.d = cf7Var;
    }

    @Override // defpackage.k24
    public void setOnCommentsEntryClickListener(af7 af7Var) {
        this.e.d = af7Var;
    }

    @Override // defpackage.jp5
    public void setOnDoubleTap(af7 af7Var) {
        this.q = af7Var;
        dka dkaVar = this.i;
        if (af7Var != null) {
            dkaVar.setTryToSingleClickAction(null);
        } else {
            dkaVar.setTryToSingleClickAction(new fnh(this, 0));
        }
    }

    @Override // defpackage.i59
    public void setOnLinkLongClickListener(zs3 zs3Var) {
        this.o = zs3Var;
    }

    @Override // defpackage.azf
    public void setOnShareButtonClickListener(af7 af7Var) {
        this.f.c = af7Var;
    }

    @Override // defpackage.z7g
    public void setOnSingleClick(af7 af7Var) {
        this.p = af7Var;
    }

    @Override // defpackage.mia
    public void setReplyClickListener(qf7 qf7Var) {
        this.b.c = qf7Var;
    }

    @Override // defpackage.khf
    public void setSenderName(Layout layout) {
        this.h.e(layout);
    }

    @Override // defpackage.khf
    public void setSenderNameColor(int i) {
        this.h.f(i);
    }

    @Override // defpackage.azf
    public void setShareButtonSwipeProgress(float f) {
        this.f.setShareButtonSwipeProgress(f);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.a.g = z;
    }

    @Override // defpackage.hnh
    public void setTextMessageColors(xac xacVar) {
        this.i.setTextColors(xacVar);
    }

    @Override // defpackage.hnh
    public void setTextMessageLayout(aka akaVar) {
        this.i.setLayout(akaVar);
    }

    @Override // defpackage.hnh
    public void setTextMessageLinkClickListener(o59 o59Var) {
        this.i.setLinkListener(o59Var);
    }

    @Override // defpackage.i59
    public final void u() {
        dka dkaVar = this.i;
        CharSequence text = dkaVar.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            gm0.Y(dka.class.getName(), "Failed to perform exclusive link click! Text has no links!");
            return;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
        if (clickableSpanArr.length == 0) {
            gm0.Y(dka.class.getName(), "Failed to perform exclusive link click! Spans is empty!");
        } else {
            ((ClickableSpan) a.a1(clickableSpanArr)).onClick(dkaVar);
        }
    }

    @Override // defpackage.k24
    public final void v(xac xacVar) {
        this.e.v(xacVar);
    }

    @Override // defpackage.azf
    public final void w() {
        this.f.w();
    }

    @Override // defpackage.b8e
    public final void x(kja kjaVar, boolean z) {
        this.a.x(kjaVar, z);
    }

    @Override // defpackage.kfa
    public boolean y(MotionEvent motionEvent) {
        return false;
    }
}
