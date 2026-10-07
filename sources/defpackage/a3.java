package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.devmenu.tools.ChatInfoDevWidget;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import one.me.stories.text.TextEditStoryWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class a3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        la3 la3VarA;
        la3 la3VarA2;
        la3 la3Var;
        List list;
        List listSingletonList;
        la3 la3Var2;
        Object value;
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                dc dcVar = (dc) obj;
                bdc.a(dcVar, new cc(dcVar, editable, 0));
                dcVar.requestLayout();
                break;
            case 2:
                mjg mjgVar = ((ChatInfoDevWidget) obj).b;
                String strValueOf = String.valueOf(editable);
                mjgVar.getClass();
                mjgVar.j(null, strValueOf);
                break;
            case 3:
                break;
            case 4:
                t7c t7cVar = (t7c) obj;
                t7cVar.d = editable;
                ny8 ny8Var = t7cVar.t;
                if (ny8Var.d()) {
                    ((View) ny8Var.getValue()).setVisibility((editable == null || editable.length() == 0) ? 8 : 0);
                }
                p7c p7cVar = t7cVar.g;
                if (p7cVar != null) {
                    p7cVar.E0(editable);
                }
                break;
            case 5:
                cf7 cf7Var = (cf7) obj;
                CharSequence charSequenceD0 = editable != null ? lvb.d0(editable) : null;
                cf7Var.invoke(charSequenceD0 != null ? charSequenceD0 : "");
                break;
            case 6:
            case 7:
                break;
            case 8:
                zv8[] zv8VarArr = ProfileReactionsSettingsScreen.p;
                jtd jtdVarP1 = ((ProfileReactionsSettingsScreen) obj).p1();
                mjg mjgVar2 = jtdVarP1.n;
                Object value2 = mjgVar2.getValue();
                la3 la3Var3 = value2 instanceof la3 ? (la3) value2 : null;
                boolean z2 = true;
                if (la3Var3 != null) {
                    if (editable != null) {
                        if (editable.length() == 0) {
                            listSingletonList = r66.a;
                        } else {
                            Object[] spans = editable.getSpans(0, editable.length(), geg.class);
                            if (spans.length == 0) {
                                listSingletonList = Collections.singletonList(editable);
                            } else {
                                pw pwVar = new pw((spans.length * 2) + 2);
                                pwVar.add(0);
                                pwVar.add(Integer.valueOf(editable.length()));
                                for (Object obj2 : spans) {
                                    int spanStart = editable.getSpanStart(obj2);
                                    int spanEnd = editable.getSpanEnd(obj2);
                                    if (spanStart != -1 && spanEnd != -1) {
                                        pwVar.add(Integer.valueOf(spanStart));
                                        pwVar.add(Integer.valueOf(spanEnd));
                                    }
                                }
                                List listL1 = ww3.L1(pwVar);
                                ArrayList arrayList = new ArrayList();
                                int size = listL1.size() - 1;
                                int i3 = 0;
                                while (i3 < size) {
                                    int iIntValue = ((Number) listL1.get(i3)).intValue();
                                    i3++;
                                    int iIntValue2 = ((Number) listL1.get(i3)).intValue();
                                    if (iIntValue < iIntValue2) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(iIntValue, iIntValue2));
                                        int length = spans.length;
                                        int i4 = i2;
                                        while (i4 < length) {
                                            Object obj3 = spans[i4];
                                            int spanStart2 = editable.getSpanStart(obj3);
                                            int i5 = i4;
                                            int spanEnd2 = editable.getSpanEnd(obj3);
                                            la3 la3Var4 = la3Var3;
                                            int spanFlags = editable.getSpanFlags(obj3);
                                            if (spanStart2 < iIntValue2 && spanEnd2 > iIntValue) {
                                                int iMax = Math.max(spanStart2, iIntValue) - iIntValue;
                                                int iMin = Math.min(spanEnd2, iIntValue2) - iIntValue;
                                                if (iMax >= 0 && iMax < iMin) {
                                                    spannableStringBuilder.setSpan(obj3, iMax, iMin, spanFlags);
                                                }
                                            }
                                            i4 = i5 + 1;
                                            la3Var3 = la3Var4;
                                        }
                                        la3Var2 = la3Var3;
                                        arrayList.add(spannableStringBuilder);
                                    } else {
                                        la3Var2 = la3Var3;
                                    }
                                    i2 = 0;
                                    z2 = z2;
                                    la3Var3 = la3Var2;
                                }
                                z = z2;
                                la3Var = la3Var3;
                                listSingletonList = arrayList;
                            }
                            list = listSingletonList;
                        }
                        z = true;
                        la3Var = la3Var3;
                        list = listSingletonList;
                    } else {
                        z = true;
                        la3Var = la3Var3;
                        list = null;
                    }
                    la3VarA = la3.a(la3Var, false, 0, list, false, false, 251);
                } else {
                    z = true;
                    la3VarA = null;
                }
                if (la3VarA != null) {
                    boolean zD = jtdVarP1.D(la3VarA);
                    List list2 = la3VarA.c;
                    la3VarA2 = la3.a(la3VarA, false, 0, null, !((list2 == null || list2.size() != la3VarA.d.size()) ? false : z), zD, 207);
                } else {
                    la3VarA2 = null;
                }
                mjgVar2.setValue(la3VarA2);
                break;
            case 9:
                ((oxg) obj).a(editable);
                break;
            default:
                TextEditStoryWidget textEditStoryWidget = (TextEditStoryWidget) obj;
                if (!textEditStoryWidget.z) {
                    koh kohVarT1 = textEditStoryWidget.t1();
                    String string = editable != null ? editable.toString() : null;
                    String str = string == null ? "" : string;
                    mjg mjgVar3 = kohVarT1.c;
                    do {
                        value = mjgVar3.getValue();
                    } while (!mjgVar3.h(value, hoh.a((hoh) value, null, 0, 0, 0, str, 0, false, 0, 239)));
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
        Object obj = this.b;
        switch (i4) {
            case 0:
                txc txcVarX1 = ((AbstractPickerScreen) obj).x1();
                String string = charSequence != null ? charSequence.toString() : null;
                mjg mjgVar = txcVarX1.k;
                if (string == null) {
                    string = "";
                }
                mjgVar.getClass();
                mjgVar.j(null, string);
                break;
            case 3:
                zv8[] zv8VarArr = LogsViewerScreen.g;
                ai9 ai9VarO1 = ((LogsViewerScreen) obj).o1();
                if (charSequence != null) {
                    ai9VarO1.getClass();
                    if (!r5h.X0(charSequence)) {
                        ai9VarO1.j.B(ai9VarO1, ai9.l[0], yab.h0(ai9VarO1.b, ((n0c) ai9VarO1.d).b(), 2, new af8(ai9VarO1, charSequence, (lq4) null, 10)));
                        ai9VarO1.C();
                    }
                }
                ai9VarO1.j.B(ai9VarO1, ai9.l[0], null);
                mjg mjgVar2 = ai9VarO1.i;
                mjgVar2.getClass();
                mjgVar2.j(null, r66.a);
                break;
            case 6:
                ((vf7) obj).invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                break;
            case 7:
                jac jacVar = (jac) obj;
                jac.g(jacVar, jacVar.getEndIconDrawable());
                jac.h(jacVar, jacVar.getMaxLengthForLabel(), charSequence != null ? charSequence.length() : 0);
                jac.f(jacVar);
                p1c p1cVar = jacVar.b;
                if (jacVar.getTypingMode() == hac.b && !(p1cVar.getTransformationMethod() instanceof PasswordTransformationMethod) && cqk.d(jacVar.getEndIconDrawable(), jacVar.e)) {
                    p1cVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    break;
                }
                break;
        }
    }
}
