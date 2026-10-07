package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tea extends uka implements med {
    public static final int[] X = {R.attr.state_enabled, R.attr.state_pressed};
    public static final int[] Y = {R.attr.state_enabled};
    public long A;
    public Long B;
    public boolean C;
    public af7 D;
    public t50 E;
    public final ny8 F;
    public final ny8 G;
    public final boolean H;
    public long I;
    public ValueAnimator J;
    public boolean K;
    public final ViewGroup y;
    public final ny8 z;

    public tea(ny8 ny8Var, Context context, ViewGroup viewGroup) {
        iea ieaVar = new iea(context, ny8Var);
        super(ieaVar);
        this.y = viewGroup;
        this.z = ny8Var;
        this.A = -1L;
        this.D = new bh9(24);
        this.F = rx8.P(3, new bh9(25));
        this.G = rx8.P(3, new ww8(22, this));
        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        ieaVar.setPaddingRelative(iK, 0, iK, 0);
        hea heaVar = new hea();
        ViewGroup viewGroup2 = ieaVar.g;
        if (viewGroup2 != null) {
            ieaVar.removeView(viewGroup2);
        }
        ieaVar.g = viewGroup;
        ieaVar.addView(viewGroup, heaVar);
        viewGroup.setClipChildren(false);
        this.H = true;
    }

    public static boolean U(vka vkaVar, t50 t50Var) {
        if (vkaVar == null) {
            return false;
        }
        int i = vkaVar.a;
        iq9 iq9Var = t50Var instanceof iq9 ? (iq9) t50Var : null;
        boolean z = iq9Var != null && iq9Var.d() && vka.c(i);
        int i2 = (-2130706433) & i;
        if (i2 == -2147483645 || i2 == -2147483641 || i2 == -2147483644 || i2 == -2147483643 || i2 == -2147483636) {
            return true;
        }
        return (vka.b(i) && !z) || (vka.a(i) && !z) || ((vka.d(i) && !z) || i2 == -2147483642);
    }

    /* JADX WARN: Failed to calculate best type for var: r3v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v2 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // defpackage.uka
    public final void H(one.me.messages.list.loader.MessageModel r20, java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tea.H(one.me.messages.list.loader.MessageModel, java.util.List):void");
    }

    public final void J(MessageModel messageModel) {
        Integer num;
        ViewParent viewParent = this.y;
        if (viewParent instanceof k24) {
            if ((((Boolean) this.D.invoke()).booleanValue() && ((k24) viewParent).k()) || (num = messageModel.t) == null) {
                ((k24) viewParent).o();
            } else {
                ((k24) viewParent).h(num.intValue());
            }
        }
    }

    public final void K(MessageModel messageModel) {
        u40 u40Var = messageModel.j;
        kg8 kg8Var = u40Var.c;
        ny8 ny8Var = this.G;
        if (kg8Var == null) {
            if (ny8Var.d()) {
                ((ng8) ny8Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ng8 ng8Var = (ng8) ny8Var.getValue();
        long j = messageModel.a;
        kg8 kg8Var2 = u40Var.c;
        int i = ng8.h;
        ng8Var.a(j, kg8Var2, false);
        iea ieaVar = (iea) this.a;
        View view = (View) ny8Var.getValue();
        hea heaVar = new hea();
        if (ieaVar.h == null) {
            ieaVar.h = view;
            ieaVar.addView(view, heaVar);
        }
        ((View) ny8Var.getValue()).setVisibility(0);
    }

    public final void L(MessageModel messageModel, boolean z) {
        boolean z2 = messageModel.z;
        ViewParent viewParent = this.y;
        if (viewParent == null) {
            return;
        }
        b8e b8eVar = (b8e) viewParent;
        b8eVar.setIsIncoming(z2);
        if (!z) {
            b8eVar.setStackFromEnd(!z2 && U(new vka(messageModel.F), messageModel.j.b));
        }
        kja kjaVar = messageModel.w;
        if (kjaVar != null) {
            b8eVar.x(kjaVar, z);
        } else {
            b8eVar.m(z);
        }
    }

    public final void M(MessageModel messageModel) {
        ViewParent viewParent = this.y;
        if (viewParent instanceof azf) {
            if (((Boolean) this.D.invoke()).booleanValue() || messageModel.v || messageModel.r() || messageModel.q.a() || messageModel.G != 3) {
                ((azf) viewParent).C();
            } else {
                ((azf) viewParent).w();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(ata ataVar, boolean z) {
        ViewGroup viewGroup = this.y;
        boolean z2 = viewGroup instanceof kfa;
        View view = this.a;
        if (z2) {
            pea peaVar = z ? new pea(ataVar, this, 4) : null;
            Context context = ((iea) view).getContext();
            qea qeaVar = new qea(this, new nea(this, ataVar), peaVar);
            GestureDetector gestureDetector = new GestureDetector(context, qeaVar);
            gestureDetector.setIsLongpressEnabled(true);
            qeaVar.c = new ww8(21, gestureDetector);
            viewGroup.setOnTouchListener(new ie8(qeaVar, this, gestureDetector, 2));
            viewGroup.setOnClickListener(null);
        } else {
            viewGroup.setOnTouchListener(null);
            qe7.H(viewGroup, 300L, new oea(this, ataVar));
        }
        b8e b8eVar = viewGroup != 0 ? (b8e) viewGroup : null;
        if (b8eVar != null) {
            b8eVar.setOnClickListener(new nea(ataVar, this));
        }
        k24 k24Var = viewGroup instanceof k24 ? (k24) viewGroup : null;
        if (k24Var != null) {
            k24Var.setOnCommentsEntryClickListener(new pea(ataVar, this, 0));
        }
        azf azfVar = viewGroup instanceof azf ? (azf) viewGroup : null;
        if (azfVar != null) {
            azfVar.setOnShareButtonClickListener(new pea(ataVar, this, 1));
        }
        ro2 ro2Var = new ro2(this, 5, ataVar);
        viewGroup.setOnLongClickListener(ro2Var);
        ((iea) view).setOnLongClickListener(ro2Var);
        mia miaVar = viewGroup instanceof mia ? (mia) viewGroup : null;
        if (miaVar != null) {
            miaVar.setReplyClickListener(new rea(2, ataVar, ata.class, "onReplyClick", "onReplyClick(JJ)V", 0, 0));
            miaVar.setForwardClickListener(new rea(2, ataVar, ata.class, "onForwardClick", "onForwardClick(Lone/me/messages/list/loader/MessageLink$ForwardModel;J)V", 0, 1));
        }
        sea seaVar = new sea(ataVar, 0, this);
        hnh hnhVar = viewGroup instanceof hnh ? (hnh) viewGroup : null;
        if (hnhVar != null) {
            hnhVar.setTextMessageLinkClickListener(seaVar);
        }
        i59 i59Var = viewGroup instanceof i59 ? (i59) viewGroup : null;
        if (i59Var != null) {
            i59Var.setOnLinkLongClickListener(new ih(ataVar, this));
        }
    }

    public final ShapeDrawable O() {
        Drawable background = this.y.getBackground();
        fea feaVar = background instanceof fea ? (fea) background : null;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(feaVar != null ? feaVar.a() : (float[]) this.F.getValue(), null, null));
        shapeDrawable.getPaint().setColor(((fn8) pq3.j.h(this.a).u().c.a).d);
        shapeDrawable.setAlpha(150);
        return shapeDrawable;
    }

    public final void P(ata ataVar, String str) {
        t50 t50Var = this.E;
        long j = this.A;
        if (t50Var == null) {
            ataVar.b(j);
            return;
        }
        MessagesListWidget messagesListWidget = ataVar.a;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        if (messagesListWidget.F1().s0(t50Var, j, str)) {
            return;
        }
        messagesListWidget.F1().w0(j);
    }

    public void Q(MessageModel messageModel) {
    }

    public void R(xac xacVar) {
    }

    public void S(kbc kbcVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T(zv7 zv7Var, qf7 qf7Var) {
        cw7 cw7Var;
        ViewGroup viewGroup = this.y;
        if (zv7Var != null) {
            List list = zv7Var.b;
            long j = this.A;
            long j2 = zv7Var.a;
            if (j == j2 && this.J != null) {
                cw7Var = viewGroup instanceof cw7 ? (cw7) viewGroup : null;
                if (cw7Var != null) {
                    cw7Var.d(list, qf7Var);
                    return true;
                }
            } else if (j == j2) {
                viewGroup.setForeground(O());
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(O().getAlpha(), 0);
                valueAnimatorOfInt.setStartDelay(300L);
                valueAnimatorOfInt.setDuration(800L);
                valueAnimatorOfInt.addUpdateListener(new ak(19, this));
                valueAnimatorOfInt.addListener(new li(10, this));
                valueAnimatorOfInt.start();
                this.J = valueAnimatorOfInt;
                cw7Var = viewGroup instanceof cw7 ? (cw7) viewGroup : null;
                if (cw7Var != null) {
                    cw7Var.d(list, qf7Var);
                }
            } else {
                ValueAnimator valueAnimator = this.J;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                cw7 cw7Var2 = viewGroup instanceof cw7 ? (cw7) viewGroup : null;
                if (cw7Var2 != null) {
                    cw7Var2.d(null, null);
                }
            }
            return true;
        }
        ValueAnimator valueAnimator2 = this.J;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        cw7 cw7Var3 = viewGroup instanceof cw7 ? (cw7) viewGroup : null;
        if (cw7Var3 != null) {
            cw7Var3.d(null, null);
            return false;
        }
        return false;
    }

    public final void V(MessageModel messageModel) {
        int i;
        Drawable background = this.y.getBackground();
        fea feaVar = background instanceof fea ? (fea) background : null;
        if (feaVar != null) {
            boolean zB = z21.b(messageModel.F & 2080374784);
            xac xacVarG = f55.g(pq3.j.h(this.a).f(), zB);
            boolean zA = messageModel.j.a();
            boolean z = messageModel.h;
            int i2 = xacVarG.d.d;
            int i3 = messageModel.F;
            int i4 = 2080374784 & i3;
            if ((134217728 & i3) != 0) {
                i = 1;
            } else if ((268435456 & i3) != 0) {
                i = 2;
            } else if ((1073741824 & i3) != 0) {
                i = 4;
            } else {
                if ((i3 & 536870912) == 0) {
                    throw new IllegalStateException("unknown bubble type ".concat(z21.c(i4)).toString());
                }
                i = 3;
            }
            if (fea.b(feaVar, zB, i, messageModel.i, z, i2, zA, 72)) {
                feaVar.invalidateSelf();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ff3
    public final void a(xac xacVar) {
        boolean z;
        wac wacVar = xacVar.b;
        ViewGroup viewGroup = this.y;
        khf khfVar = viewGroup instanceof khf ? (khf) viewGroup : null;
        a8g a8gVar = pq3.j;
        View view = this.a;
        if (khfVar != null) {
            khfVar.setSenderNameColor(isk.i(a8gVar.h(view), this.B, wacVar.f));
        }
        fhf fhfVar = viewGroup instanceof fhf ? (fhf) viewGroup : null;
        if (fhfVar != null) {
            fhfVar.setAliasColor(wacVar.e);
        }
        hnh hnhVar = viewGroup instanceof hnh ? (hnh) viewGroup : null;
        if (hnhVar != null) {
            hnhVar.setTextMessageColors(xacVar);
        }
        mia miaVar = viewGroup instanceof mia ? (mia) viewGroup : null;
        if (miaVar != null) {
            miaVar.p(xacVar);
        }
        b8e b8eVar = viewGroup != 0 ? (b8e) viewGroup : null;
        if (b8eVar != null) {
            if (U(this.x, this.E)) {
                q1i q1iVar = viewGroup instanceof q1i ? (q1i) viewGroup : null;
                if (q1iVar == null || !q1iVar.q()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            b8eVar.G(xacVar, z);
        }
        k24 k24Var = viewGroup instanceof k24 ? (k24) viewGroup : null;
        if (k24Var != null) {
            k24Var.v(xacVar);
        }
        Drawable background = viewGroup.getBackground();
        fea feaVar = background instanceof fea ? (fea) background : null;
        if (feaVar != null) {
            int[] iArr = ((xac) a8gVar.h(view).f().a).a.n.a;
            eea eeaVar = feaVar.p;
            zv8[] zv8VarArr = fea.v;
            eeaVar.B(feaVar, zv8VarArr[0], iArr);
            feaVar.q.B(feaVar, zv8VarArr[1], ((xac) a8gVar.h(view).f().b).a.n.a);
            feaVar.invalidateSelf();
        }
        R(xacVar);
    }

    @Override // defpackage.med
    public final long c() {
        return this.I;
    }

    @Override // defpackage.med
    public final boolean f() {
        return this.H;
    }

    @Override // defpackage.ff3
    public final void h(kbc kbcVar) {
        Paint paint;
        Drawable foreground = this.y.getForeground();
        ShapeDrawable shapeDrawable = foreground instanceof ShapeDrawable ? (ShapeDrawable) foreground : null;
        if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
            paint.setColor(((fn8) pq3.j.h(this.a).u().c.a).d);
        }
        S(kbcVar);
    }
}
