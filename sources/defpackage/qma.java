package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Editable;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qma implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ qma(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 6;
        int i3 = 0;
        MessageWriteWidget messageWriteWidget = this.b;
        sbi sbiVar = sbi.a;
        int i4 = 2;
        switch (i) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj;
                zv8[] zv8VarArr = MessageWriteWidget.I;
                tha thaVar = new tha(viewGroup.getContext());
                MessageWriteWidget messageWriteWidget2 = this.b;
                Object objF0 = tre.f0(messageWriteWidget2.getArgs(), "arg_scope_id", t3f.class);
                if (objF0 == null) {
                    c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
                    return null;
                }
                t3f t3fVar = (t3f) ((Parcelable) objF0);
                thaVar.setSendIconResId(sol.e(t3fVar) ? R.drawable.icon_clock : R.drawable.icon_arrow_up);
                thaVar.setTextSelectionListener(new i1m(messageWriteWidget2));
                thaVar.setOnTouchInputListener(new fv9(messageWriteWidget2, 14, thaVar));
                thaVar.setLeftInnerIconTouchListener(MessageWriteWidget.s1(thaVar.getContext(), new pma(messageWriteWidget2, i4)));
                thaVar.setRightInnerIconVisible(true);
                int i5 = 0;
                int i6 = 0;
                thaVar.setRightInnerIconTouchListener(MessageWriteWidget.s1(thaVar.getContext(), new kj1(i6, messageWriteWidget2, MessageWriteWidget.class, "onClickAttachPicker", "onClickAttachPicker()V", i5, 18)));
                Context context = thaVar.getContext();
                kj1 kj1Var = new kj1(i6, messageWriteWidget2, MessageWriteWidget.class, "onRightOuterIconClick", "onRightOuterIconClick()V", i5, 19);
                kj1 kj1Var2 = new kj1(0, messageWriteWidget2, MessageWriteWidget.class, "onSendLongClick", "onSendLongClick()V", i5, 20);
                fz7 fz7Var = new fz7(1, messageWriteWidget2, MessageWriteWidget.class, "onTouch", "onTouch(Landroid/view/MotionEvent;)V", i5, 8);
                GestureDetector gestureDetector = new GestureDetector(context, new gk7(kj1Var, i4, kj1Var2));
                int i7 = 3;
                thaVar.setRightOuterIconTouchListener(new nt1(fz7Var, i7, gestureDetector));
                thaVar.setVideoMessageTouchListener(new zw1(i4, messageWriteWidget2));
                thaVar.setScheduledMessagesTouchListener(MessageWriteWidget.s1(thaVar.getContext(), new pma(messageWriteWidget2, i7)));
                if (((Boolean) messageWriteWidget2.o.getValue()).booleanValue()) {
                    thaVar.f.addTextChangedListener(new jgf(new wga(thaVar, 9), new qma(messageWriteWidget2, i4)));
                }
                thaVar.setCustomSelectionActionModeCallback(new iaa(messageWriteWidget2, i2, t3fVar));
                if (sol.d(t3fVar)) {
                    thaVar.setRightInnerIconVisible(false);
                    thaVar.setRightInnerIconTouchListener(null);
                    thaVar.setVideoMessageEnabled(false);
                    thaVar.setEmojiExpandableState(eha.a);
                    thaVar.setShowSendOnlyWhenHasText(true);
                    thaVar.setRightOuterIconActionState(jha.a);
                }
                if (cqk.d(t3fVar.a, "StoriesScreen")) {
                    thaVar.setRightInnerIconVisible(false);
                    thaVar.setRightInnerIconTouchListener(null);
                    thaVar.setVideoMessageEnabled(false);
                    thaVar.setShowSendOnlyWhenHasText(true);
                    thaVar.setRightOuterIconActionState(new iha(new cha(false)));
                    thaVar.setCustomTheme(messageWriteWidget2.G);
                }
                viewGroup.addView(thaVar);
                View tp2Var = new tp2(viewGroup.getContext());
                tp2Var.setId(R.id.writebar__record_controls);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                tp2Var.setLayoutParams(layoutParams);
                tp2Var.setBackgroundColor(0);
                viewGroup.addView(tp2Var);
                return sbiVar;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zv8[] zv8VarArr2 = MessageWriteWidget.I;
                if (zBooleanValue) {
                    nma.M(messageWriteWidget.A1(), 2, 2);
                }
                return sbiVar;
            case 2:
                MessageWriteWidget.G1(messageWriteWidget, (CharSequence) obj, null, 2);
                return sbiVar;
            case 3:
                LinearLayout linearLayout = (LinearLayout) obj;
                zv8[] zv8VarArr3 = MessageWriteWidget.I;
                qma qmaVar = new qma(messageWriteWidget, i3);
                View frameLayout = new FrameLayout(linearLayout.getContext());
                frameLayout.setId(R.id.writebar__container);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                qmaVar.invoke(frameLayout);
                linearLayout.addView(frameLayout);
                if (((Boolean) messageWriteWidget.E.getValue()).booleanValue()) {
                    RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
                    recyclerView.setId(R.id.writebar__miui_menu);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                    recyclerView.setLayoutParams(layoutParams2);
                    recyclerView.setMinimumHeight(gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                    recyclerView.setAdapter((sj9) messageWriteWidget.D.getValue());
                    recyclerView.h(new q91(6), -1);
                    recyclerView.setHorizontalFadingEdgeEnabled(true);
                    recyclerView.setOverScrollMode(2);
                    recyclerView.setFadingEdgeLength(gm0.K(50.0f * yl5.d().getDisplayMetrics().density));
                    recyclerView.setHasFixedSize(true);
                    linearLayout.addView(recyclerView);
                }
                return sbiVar;
            case 4:
                wj9 wj9Var = (wj9) obj;
                zv8[] zv8VarArr4 = MessageWriteWidget.I;
                int selectionStart = messageWriteWidget.t1().getSelectionStart();
                int selectionEnd = messageWriteWidget.t1().getSelectionEnd();
                Editable editableOriginal = messageWriteWidget.t1().getEditableOriginal();
                qj9 qj9VarU1 = messageWriteWidget.u1();
                qj9VarU1.getClass();
                if (editableOriginal == null || editableOriginal.length() == 0) {
                    gm0.n(qj9.class.getName(), "Early return in miuiMenuItemClick cuz of text == null || text.isEmpty()");
                } else {
                    int i8 = wj9Var.a;
                    a8j.x(qj9VarU1.i, i8 == R.id.markdown_link ? new tj9(editableOriginal, selectionStart, selectionEnd) : new uj9(i8, editableOriginal, selectionStart, selectionEnd));
                    qj9.B(qj9VarU1, 1);
                }
                return sbiVar;
            default:
                zv8[] zv8VarArr5 = MessageWriteWidget.I;
                nma nmaVarA1 = messageWriteWidget.A1();
                a8j.x(nmaVarA1.x, new ula((Uri) obj, nmaVarA1.H().J(2)));
                return sbiVar;
        }
    }
}
