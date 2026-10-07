package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fn9 implements ActionMode.Callback {
    public final EditText a;
    public final gjg b;
    public final boolean c;
    public final uik d;
    public final boolean e;
    public final f8b f = new f8b();

    public fn9(EditText editText, gjg gjgVar, boolean z, uik uikVar, boolean z2) {
        this.a = editText;
        this.b = gjgVar;
        this.c = z;
        this.d = uikVar;
        this.e = z2;
    }

    public final void a(int i, Editable editable, int i2, int i3) {
        int i4 = 0;
        if (i == R.id.markdown_bold) {
            tre.w0(editable, i2, i3, false, new vz0());
            return;
        }
        if (i == R.id.markdown_italic) {
            tre.w0(editable, i2, i3, false, new jn8());
            return;
        }
        if (i == R.id.markdown_underline) {
            tre.w0(editable, i2, i3, true, new h5h(1));
            return;
        }
        if (i == R.id.markdown_mono) {
            tre.w0(editable, i2, i3, true, new d1b());
            return;
        }
        if (i == R.id.markdown_strikethrough) {
            tre.w0(editable, i2, i3, true, new h5h(0));
            return;
        }
        if (i == R.id.markdown_heading) {
            tre.w0(editable, i2, i3, true, new ju7());
            return;
        }
        sbi sbiVar = sbi.a;
        EditText editText = this.a;
        if (i != R.id.markdown_quote) {
            if (i != R.id.markdown_regular) {
                if (i == 16908320 || i == 16908321) {
                    return;
                }
                gm0.n("fn9", String.format(Locale.ENGLISH, "Unidentified item with id = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
                return;
            }
            y2e[] y2eVarArr = (y2e[]) editable.getSpans(i2, i3, y2e.class);
            if (y2eVarArr.length != 0) {
                editText.setTag(R.id.text_change_is_programmatic_tag, sbiVar);
                try {
                    editText.getText();
                    int i5 = i2;
                    int i6 = i3;
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (!tre.i0(editable.charAt(i7))) {
                            break;
                        }
                        Selection.setSelection(editable, Math.min(editable.length(), i6));
                        editable.delete(i7, i5);
                        i5--;
                        i6--;
                    }
                    if (i5 > 0 && editable.charAt(i5 - 1) != '\n') {
                        editable.insert(i5, "\n");
                        i5++;
                        i6++;
                    }
                    while (i6 < editable.length() && tre.i0(editable.charAt(i6))) {
                        editable.delete(i6, i6 + 1);
                    }
                    if (i6 < editable.length() && editable.charAt(i6) != '\n') {
                        editable.insert(i6, "\n");
                    }
                    int iMax = Math.max(0, i5);
                    int iMin = Math.min(i6, editable.length());
                    int length = y2eVarArr.length;
                    while (i4 < length) {
                        tre.x0(editable, y2eVarArr[i4], iMax - 1, iMin + 1);
                        i4++;
                    }
                    ysk.b(editable);
                    editText.setTag(R.id.text_change_is_programmatic_tag, null);
                } catch (Throwable th) {
                    editText.setTag(R.id.text_change_is_programmatic_tag, null);
                    throw th;
                }
            }
            tre.o0(editable, i2, i3);
            return;
        }
        y2e[] y2eVarArr2 = (y2e[]) editable.getSpans(i2, i3, y2e.class);
        editText.setTag(R.id.text_change_is_programmatic_tag, sbiVar);
        try {
            editText.getText();
            if (y2eVarArr2.length == 0) {
                while (i2 > 0) {
                    int i8 = i2 - 1;
                    if (!tre.i0(editable.charAt(i8))) {
                        break;
                    }
                    Selection.setSelection(editable, Math.min(editable.length(), i3));
                    editable.delete(i8, i2);
                    i2--;
                    i3--;
                }
                if (i2 > 0 && editable.charAt(i2 - 1) != '\n') {
                    editable.insert(i2, "\n");
                    i2++;
                    i3++;
                }
                while (i3 < editable.length() && tre.i0(editable.charAt(i3))) {
                    editable.delete(i3, i3 + 1);
                }
                if (i3 < editable.length() && editable.charAt(i3) != '\n') {
                    editable.insert(i3, "\n");
                }
                int iMax2 = Math.max(0, i2);
                int iMin2 = Math.min(i3, editable.length());
                n1g.e0(editable, new y2e(b()), iMax2, iMin2, 17);
                Selection.setSelection(editable, Math.min(editable.length(), iMin2 + 1));
            } else {
                while (i2 > 0) {
                    int i9 = i2 - 1;
                    if (!tre.i0(editable.charAt(i9))) {
                        break;
                    }
                    Selection.setSelection(editable, Math.min(editable.length(), i3));
                    editable.delete(i9, i2);
                    i2--;
                    i3--;
                }
                if (i2 > 0 && editable.charAt(i2 - 1) != '\n') {
                    editable.insert(i2, "\n");
                    i2++;
                    i3++;
                }
                while (i3 < editable.length() && tre.i0(editable.charAt(i3))) {
                    editable.delete(i3, i3 + 1);
                }
                if (i3 < editable.length() && editable.charAt(i3) != '\n') {
                    editable.insert(i3, "\n");
                }
                int iMax3 = Math.max(0, i2);
                int iMin3 = Math.min(i3, editable.length());
                int length2 = y2eVarArr2.length;
                while (i4 < length2) {
                    tre.x0(editable, y2eVarArr2[i4], iMax3 - 1, iMin3 + 1);
                    i4++;
                }
            }
            editText.setTag(R.id.text_change_is_programmatic_tag, null);
            ysk.b(editable);
        } catch (Throwable th2) {
            editText.setTag(R.id.text_change_is_programmatic_tag, null);
            throw th2;
        }
    }

    public final x2e b() {
        EditText editText = this.a;
        Context context = editText.getContext();
        x2e x2eVar = new x2e(context, this.b, (xac) pq3.j.e(context).m().f().a, q9i.t.h(), wk8.p(context, R.drawable.icon_quote), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), false);
        x2eVar.f = new w2e(0, new WeakReference(editText));
        return x2eVar;
    }

    public final boolean c() {
        EditText editText = this.a;
        return this.c && !(editText.getSelectionStart() < editText.getSelectionEnd() && editText.getText().getSpans(editText.getSelectionStart(), editText.getSelectionEnd(), y2e.class).length != 0);
    }

    public final void d(Editable editable, int i, int i2) {
        k59[] k59VarArr = (k59[]) editable.getSpans(i, i2, k59.class);
        uik uikVar = this.d;
        if (k59VarArr == null || k59VarArr.length == 0) {
            MessageWriteWidget messageWriteWidget = (MessageWriteWidget) uikVar.b;
            zv8[] zv8VarArr = MessageWriteWidget.I;
            a8j.x(((hn9) messageWriteWidget.d.getValue()).d, new jb(i, i2, null));
            return;
        }
        for (k59 k59Var : k59VarArr) {
            int spanStart = editable.getSpanStart(k59Var);
            int spanEnd = editable.getSpanEnd(k59Var);
            if (spanStart == i && spanEnd == i2) {
                String str = k59Var.c;
                MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) uikVar.b;
                zv8[] zv8VarArr2 = MessageWriteWidget.I;
                a8j.x(((hn9) messageWriteWidget2.d.getValue()).d, new jb(i, i2, str));
                return;
            }
        }
        MessageWriteWidget messageWriteWidget3 = (MessageWriteWidget) uikVar.b;
        zv8[] zv8VarArr3 = MessageWriteWidget.I;
        a8j.x(((hn9) messageWriteWidget3.d.getValue()).d, new jb(i, i2, null));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        EditText editText = this.a;
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        Editable text = editText.getText();
        if (text != null && text.length() != 0) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.markdown_bold) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == R.id.markdown_italic) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == R.id.markdown_underline) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == R.id.markdown_mono) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == R.id.markdown_strikethrough) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == R.id.markdown_link) {
                d(text, selectionStart, selectionEnd);
                return true;
            }
            if (itemId == R.id.markdown_heading) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == R.id.markdown_quote) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == R.id.markdown_regular) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId != 16908320 && itemId != 16908321) {
                gm0.n("fn9", String.format(Locale.ENGLISH, "Unidentified item with id = %d", Arrays.copyOf(new Object[]{Integer.valueOf(menuItem.getItemId())}, 1)));
            }
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        f8b f8bVar = this.f;
        f8bVar.c();
        f8bVar.a(android.R.id.cut);
        f8bVar.a(android.R.id.copy);
        boolean zC = c();
        for (en9 en9Var : en9.c) {
            int i = en9Var.a;
            if (i != R.id.markdown_quote || zC) {
                if (i != R.id.markdown_link || this.e) {
                    menu.add(R.id.markdown_group, i, en9Var.ordinal(), this.a.getResources().getString(en9Var.b)).setShowAsAction(0);
                    f8bVar.a(i);
                }
            }
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f.c();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (c()) {
            int i = 0;
            while (true) {
                if (!(i < menu.size())) {
                    LinkedHashSet linkedHashSet = en9.c;
                    menu.add(R.id.markdown_group, R.id.markdown_quote, 8, this.a.getResources().getString(R.string.markdown_quote)).setShowAsAction(0);
                    this.f.a(R.id.markdown_quote);
                    break;
                }
                int i2 = i + 1;
                MenuItem item = menu.getItem(i);
                if (item == null) {
                    ore.i();
                    return false;
                }
                if (item.getItemId() == R.id.markdown_quote) {
                    break;
                }
                i = i2;
            }
        } else {
            menu.removeItem(R.id.markdown_quote);
        }
        if (!this.e) {
            menu.removeItem(R.id.markdown_link);
        }
        pu6 pu6Var = new pu6(yhf.m0(new tw(2, menu), new lh9(3, this)));
        while (pu6Var.hasNext()) {
            menu.removeItem(((MenuItem) pu6Var.next()).getItemId());
        }
        return true;
    }
}
