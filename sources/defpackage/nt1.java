package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.stories.edit.EditStoryScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nt1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nt1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x015c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        int i = this.a;
        a2i a2iVar = null;
        a2iVar = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                xk1 xk1Var = (xk1) obj2;
                p1c p1cVar = (p1c) obj;
                zv8[] zv8VarArr = CallOpponentsListWidget.v;
                if (!(view instanceof EditText)) {
                    return false;
                }
                EditText editText = (EditText) view;
                if (motionEvent.getX() < editText.getWidth() - editText.getTotalPaddingRight()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    xk1Var.invoke(p1cVar);
                }
                return true;
            case 1:
                EditStoryScreen editStoryScreen = (EditStoryScreen) obj2;
                rcc rccVar = (rcc) obj;
                zv8[] zv8VarArr2 = EditStoryScreen.A1;
                if (motionEvent.getActionMasked() == 0) {
                    rcc rccVarY1 = editStoryScreen.y1();
                    int[] iArr = editStoryScreen.s1;
                    rccVarY1.getLocationOnScreen(iArr);
                    zk2 zk2VarX1 = editStoryScreen.x1();
                    int[] iArr2 = editStoryScreen.q1;
                    zk2VarX1.getLocationOnScreen(iArr2);
                    editStoryScreen.t1 = iArr[0] - iArr2[0];
                    editStoryScreen.u1 = iArr[1] - iArr2[1];
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (!rccVar.z && ((!(rccVar.A == null && rccVar.C == null && !rccVar.hasOnClickListeners()) && rccVar.w.contains(x, y)) || (((rect = rccVar.s) != null && rect.contains(x, y)) || (((rect2 = rccVar.t) != null && rect2.contains(x, y)) || (((rect3 = rccVar.u) != null && rect3.contains(x, y)) || ((rect4 = rccVar.v) != null && rect4.contains(x, y))))))) {
                        z = false;
                    } else {
                        zk2 zk2VarX2 = editStoryScreen.x1();
                        float x2 = motionEvent.getX() + editStoryScreen.t1;
                        float y2 = motionEvent.getY() + editStoryScreen.u1;
                        if (zk2VarX2.getVisibility() == 0) {
                            gy8 gy8Var = zk2VarX2.n1;
                            a2i a2iVarG = gy8Var.g(gy8Var.c);
                            if (a2iVarG != null) {
                                long jA = a2iVarG.a();
                                Long l = gy8Var.d;
                                if (l == null || jA != l.longValue()) {
                                    a2iVar = a2iVarG;
                                }
                            }
                            if ((a2iVar == null || gy8Var.e(a2iVar, x2, y2) == 1) && gy8Var.c(x2, y2) == null && (a2iVar == null || !a2iVar.j(x2, y2))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                    editStoryScreen.v1 = z;
                }
                if (!editStoryScreen.v1) {
                    return false;
                }
                float f = editStoryScreen.t1;
                float f2 = editStoryScreen.u1;
                motionEvent.offsetLocation(f, f2);
                editStoryScreen.x1().dispatchTouchEvent(motionEvent);
                motionEvent.offsetLocation(-f, -f2);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1 || actionMasked == 3) {
                    editStoryScreen.v1 = false;
                }
                return true;
            case 2:
                tha thaVar = (tha) obj2;
                GestureDetector gestureDetector = (GestureDetector) obj;
                if (thaVar.getDisallowParentInterceptTouchEvent()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        thaVar.getParent().requestDisallowInterceptTouchEvent(true);
                    } else if (action == 1 || action == 3) {
                        thaVar.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                return gestureDetector.onTouchEvent(motionEvent);
            case 3:
                zv8[] zv8VarArr3 = MessageWriteWidget.I;
                ((fz7) obj2).invoke(motionEvent);
                return ((GestureDetector) obj).onTouchEvent(motionEvent);
            case 4:
                cq3 cq3Var = (cq3) obj2;
                k01 k01Var = (k01) obj;
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                Drawable chipIcon = cq3Var.getChipIcon();
                if (motionEvent.getX() > cq3Var.getChipStartPadding() + (chipIcon != null ? chipIcon.getIntrinsicWidth() : 0)) {
                    return false;
                }
                k01Var.invoke();
                return true;
            default:
                kmg kmgVar = (kmg) obj2;
                cf7 cf7Var = (cf7) obj;
                vaf vafVar = kmgVar.y;
                taf tafVar = vafVar instanceof taf ? (taf) vafVar : null;
                if (motionEvent.getAction() == 0 && tafVar != null && tafVar.f && cf7Var != null) {
                    cf7Var.invoke(kmgVar);
                }
                return false;
        }
    }
}
