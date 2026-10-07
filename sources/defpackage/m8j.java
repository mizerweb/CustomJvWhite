package defpackage;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class m8j implements View.OnAttachStateChangeListener, TextWatcher {
    public final WeakReference a;

    public m8j(TextView textView) {
        this.a = new WeakReference(textView);
        if (textView.isAttachedToWindow()) {
            a(textView);
        }
    }

    public static void a(TextView textView) {
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), k8j.class) : null;
        if (spans == null) {
            spans = new k8j[0];
        }
        for (Object obj : spans) {
            ((k8j) obj).attach(textView);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextView textView = (TextView) this.a.get();
        if (textView != null) {
            a(textView);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            int i4 = i2 + i;
            Object[] spans = null;
            try {
                Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
                if (spanned != null) {
                    spans = spanned.getSpans(i, i4, k8j.class);
                }
            } catch (Throwable unused) {
            }
            if (spans == null) {
                spans = new k8j[0];
            }
            for (k8j k8jVar : (k8j[]) spans) {
                TextView textView = (TextView) this.a.get();
                if (textView != null) {
                    k8jVar.detach(textView);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        a((TextView) view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), k8j.class) : null;
        if (spans == null) {
            spans = new k8j[0];
        }
        for (Object obj : spans) {
            ((k8j) obj).detach(view);
        }
    }
}
