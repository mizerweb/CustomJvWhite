package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ie8 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ie8(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                View view2 = (View) obj3;
                List list = (List) obj2;
                List list2 = (List) obj;
                int action = motionEvent.getAction();
                if (action == 0) {
                    view2.setPivotX(view2.getWidth() / 2.0f);
                    view2.setPivotY(view2.getHeight() / 2.0f);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((ifg) it.next()).b();
                    }
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((ifg) it2.next()).g();
                    }
                } else if (action == 1 || action == 3) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((ifg) it3.next()).b();
                    }
                    view2.setScaleX(0.9f);
                    view2.setScaleY(0.9f);
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ((ifg) it4.next()).g();
                    }
                }
                return false;
            case 1:
                ArrayList arrayList = (ArrayList) obj3;
                List<View> list3 = (List) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        ((ifg) it5.next()).b();
                    }
                    for (View view3 : list3) {
                        view3.setScaleX(1.0f);
                        view3.setScaleY(1.0f);
                    }
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        ((ifg) it6.next()).g();
                    }
                } else if (action2 == 1 || action2 == 3) {
                    Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        ((ifg) it7.next()).b();
                    }
                    for (View view4 : list3) {
                        view4.setScaleX(0.95f);
                        view4.setScaleY(0.95f);
                    }
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        ((ifg) it8.next()).g();
                    }
                }
                return false;
            default:
                qea qeaVar = (qea) obj3;
                tea teaVar = (tea) obj2;
                GestureDetector gestureDetector = (GestureDetector) obj;
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    qeaVar.d = false;
                }
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    teaVar.K = false;
                }
                ViewParent viewParent = teaVar.y;
                View view5 = teaVar.a;
                if (!(viewParent instanceof kfa) || !((kfa) viewParent).f(motionEvent)) {
                    gestureDetector.setIsLongpressEnabled(true);
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                if (motionEvent.getActionMasked() != 5) {
                    return true;
                }
                teaVar.K = true;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setAction(3);
                gestureDetector.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                gestureDetector.setIsLongpressEnabled(false);
                qeaVar.d = true;
                iea ieaVar = (iea) view5;
                ieaVar.cancelLongPress();
                ieaVar.setPressed(false);
                return true;
        }
    }
}
