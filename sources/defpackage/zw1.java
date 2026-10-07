package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.stories.text.TextEditStoryWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zw1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zw1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        ViewParent parent2;
        boolean z;
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                CallScreen callScreen = (CallScreen) obj;
                l6m l6mVar = CallScreen.D1;
                if (motionEvent == null) {
                    return false;
                }
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
                    if (motionEvent.getAction() != 1 || eventTime >= ViewConfiguration.getTapTimeout() || !callScreen.R1().D(callScreen.N1().g)) {
                        return false;
                    }
                    CallScreen.G1(callScreen);
                }
                return true;
            case 1:
                View view2 = ((vn4) obj).a;
                int action = motionEvent.getAction();
                if ((action == 0 || action == 2) && (parent = view2.getParent()) != null && (parent2 = parent.getParent()) != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                return view2.onTouchEvent(motionEvent);
            case 2:
                zv8[] zv8VarArr = MessageWriteWidget.I;
                mjg mjgVar = ((MessageWriteWidget) obj).A1().r1;
                mla mlaVar = new mla(fbe.a, motionEvent);
                mjgVar.getClass();
                mjgVar.j(null, mlaVar);
                mjgVar.setValue(null);
                return true;
            case 3:
                PhotoEditScreen photoEditScreen = (PhotoEditScreen) obj;
                motionEvent.offsetLocation(photoEditScreen.Z, photoEditScreen.n1);
                return photoEditScreen.t1().dispatchTouchEvent(motionEvent);
            case 4:
                TextEditStoryWidget textEditStoryWidget = (TextEditStoryWidget) obj;
                zv8[] zv8VarArr2 = TextEditStoryWidget.B;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    LinearLayout linearLayout = textEditStoryWidget.k;
                    Rect rect = textEditStoryWidget.u;
                    int[] iArr = textEditStoryWidget.t;
                    if (linearLayout != null) {
                        ((FrameLayout) textEditStoryWidget.i.m(textEditStoryWidget, TextEditStoryWidget.B[6])).getLocationOnScreen(iArr);
                        int rawX = (int) (motionEvent.getRawX() - iArr[0]);
                        int rawY = (int) (motionEvent.getRawY() - iArr[1]);
                        linearLayout.getHitRect(rect);
                        if (!rect.contains(rawX, rawY)) {
                            mjg mjgVar2 = textEditStoryWidget.t1().c;
                            do {
                                value = mjgVar2.getValue();
                            } while (!mjgVar2.h(value, hoh.a((hoh) value, null, 0, 0, 0, null, 0, false, 0, 191)));
                            return true;
                        }
                    }
                    Layout layout = textEditStoryWidget.s1().getLayout();
                    if (layout != null) {
                        int totalPaddingTop = textEditStoryWidget.s1().getTotalPaddingTop();
                        z = motionEvent.getY() < ((float) totalPaddingTop) || motionEvent.getY() > ((float) (layout.getHeight() + totalPaddingTop));
                    }
                    textEditStoryWidget.w = z;
                    textEditStoryWidget.x = motionEvent.getX();
                    textEditStoryWidget.y = motionEvent.getY();
                    if (textEditStoryWidget.w) {
                        return true;
                    }
                } else if (actionMasked == 1 && textEditStoryWidget.w) {
                    float scaledTouchSlop = ViewConfiguration.get(textEditStoryWidget.getContext()).getScaledTouchSlop();
                    if (Math.abs(motionEvent.getX() - textEditStoryWidget.x) < scaledTouchSlop && Math.abs(motionEvent.getY() - textEditStoryWidget.y) < scaledTouchSlop) {
                        textEditStoryWidget.q1();
                        return true;
                    }
                }
                return view.onTouchEvent(motionEvent);
            case 5:
                ((cf7) obj).invoke(motionEvent);
                return true;
            case 6:
                VideoWebViewScreen videoWebViewScreen = (VideoWebViewScreen) obj;
                zv8[] zv8VarArr3 = VideoWebViewScreen.A;
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
                    videoWebViewScreen.G1(true);
                    videoWebViewScreen.N1();
                }
                return false;
            default:
                zv8[] zv8VarArr4 = WebAppRootScreen.G;
                ((WebAppRootScreen) obj).J1().U1 = System.currentTimeMillis();
                return false;
        }
    }
}
