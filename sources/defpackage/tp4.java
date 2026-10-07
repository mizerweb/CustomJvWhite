package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class tp4 extends s7g {
    public final /* synthetic */ int u = 2;
    public final Object v;
    public final Object w;
    public Object x;

    public tp4(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(R.id.threads_state_state_view);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(18.0f);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 5.0f);
        textView2.setLayoutParams(layoutParams2);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(-16776961);
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = gm0.K(5.0f * yl5.d().getDisplayMetrics().density);
        textView3.setLayoutParams(layoutParams3);
        textView3.setTextSize(14.0f);
        textView3.setTextColor(-16776961);
        linearLayout.addView(textView3);
        super(linearLayout);
        this.v = (TextView) linearLayout.getChildAt(0);
        this.w = (TextView) linearLayout.getChildAt(1);
        this.x = (TextView) linearLayout.getChildAt(2);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        int i = this.u;
        Object obj = this.w;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.x;
                if ((k79Var instanceof sp4) && viewGroup.getChildCount() <= 0) {
                    ((er3) obj2).getClass();
                    viewGroup.addView(er3.C(this.a.getContext(), ((sp4) k79Var).a, (cf7) obj));
                    break;
                }
                break;
            case 1:
                izb izbVar = (izb) obj2;
                if (k79Var instanceof k8a) {
                    k8a k8aVar = (k8a) k79Var;
                    s5e s5eVar = k8aVar.h;
                    CharSequence charSequence = k8aVar.b;
                    this.x = k8aVar;
                    izbVar.j(k8aVar.a, charSequence, k8aVar.d);
                    izbVar.setTitle(charSequence);
                    ((TextView) obj).setText(s5eVar != null ? s5eVar.a : null);
                    H(s5eVar != null);
                    break;
                }
                break;
            default:
                de6 de6Var = (de6) k79Var;
                ((TextView) obj2).setText(de6Var.a);
                StringBuilder sbC = nbh.C("completedTasks: ");
                sbC.append(de6Var.c);
                sbC.append(", activeTasks: ");
                int i2 = de6Var.d;
                sbC.append(i2);
                sbC.append(", idleThreads: ");
                sbC.append(de6Var.b);
                sbC.append(", tasksInQueue: ");
                sbC.append(i2);
                ((TextView) obj).setText(sbC);
                ((TextView) this.x).setText("isShutdown: " + de6Var.f + ", isTerminated: " + de6Var.g);
                break;
        }
    }

    @Override // defpackage.s7g
    public void C(k79 k79Var, Object obj) {
        switch (this.u) {
            case 1:
                if (!(obj instanceof j8a)) {
                    B(k79Var);
                } else {
                    s5e s5eVar = ((j8a) obj).a;
                    CharSequence charSequence = s5eVar != null ? s5eVar.a : null;
                    ((TextView) this.w).setText(charSequence);
                    H(charSequence != null);
                }
                break;
            default:
                super.C(k79Var, obj);
                break;
        }
    }

    public void H(boolean z) {
        izb izbVar = (izb) this.v;
        izbVar.setPadding(izbVar.getPaddingLeft(), izbVar.getPaddingTop(), z ? gm0.K(36.0f * yl5.d().getDisplayMetrics().density) : 0, izbVar.getPaddingBottom());
    }

    public tp4(Context context, cf7 cf7Var) {
        d8a d8aVar = new d8a(context, 0);
        d8aVar.setLayoutParams(new wee(-1, -2));
        izb izbVar = new izb(context, false);
        izbVar.setId(R.id.messages_list_context_members_member_cell);
        izbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 16));
        izbVar.setPadding(0, izbVar.getPaddingTop(), 0, izbVar.getPaddingBottom());
        d8aVar.addView(izbVar);
        TextView textView = new TextView(context);
        textView.setId(R.id.messages_list_context_members_member_reaction);
        int iK = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(new FrameLayout.LayoutParams(iK, iK, 8388629));
        textView.setGravity(17);
        textView.setTextSize(1, 16.0f);
        d8aVar.addView(textView);
        super(d8aVar);
        this.v = (izb) d8aVar.findViewById(R.id.messages_list_context_members_member_cell);
        this.w = (TextView) d8aVar.findViewById(R.id.messages_list_context_members_member_reaction);
        qe7.H(d8aVar, 300L, new z36(this, 22, cf7Var));
    }

    public tp4(Context context, er3 er3Var, lfa lfaVar) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        super(frameLayout);
        this.v = er3Var;
        this.w = lfaVar;
        this.x = frameLayout;
    }
}
