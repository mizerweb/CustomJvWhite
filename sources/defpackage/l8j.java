package defpackage;

import android.text.DynamicLayout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class l8j {
    public static final ArrayList a;

    static {
        List listN1 = a.n1(DynamicLayout.class.getDeclaredClasses());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN1) {
            if (SpanWatcher.class.isAssignableFrom((Class) obj)) {
                arrayList.add(obj);
            }
        }
        a = arrayList;
    }

    public static final m8j a(TextView textView) {
        m8j m8jVar = new m8j(textView);
        textView.addTextChangedListener(m8jVar);
        textView.addOnAttachStateChangeListener(m8jVar);
        urb urbVar = textView instanceof urb ? (urb) textView : null;
        if (urbVar != null) {
            urbVar.setObserverSpanListener(m8jVar);
        }
        return m8jVar;
    }

    public static final void b(trb trbVar, Object obj) {
        Object obj2;
        CharSequence spannableText = trbVar.getSpannableText();
        Object[] spans = null;
        Spannable spannable = spannableText instanceof Spannable ? (Spannable) spannableText : null;
        if (spannable == null) {
            trbVar.invalidate();
            return;
        }
        int spanStart = spannable.getSpanStart(obj);
        if (spanStart == -1) {
            trbVar.invalidate();
            return;
        }
        int spanEnd = spannable.getSpanEnd(obj);
        if (spanEnd >= spanStart) {
            CharSequence spannableText2 = trbVar.getSpannableText();
            int i = 0;
            if (spannableText2 != null) {
                int length = spannableText2.length();
                try {
                    Spanned spanned = spannableText2 instanceof Spanned ? (Spanned) spannableText2 : null;
                    if (spanned != null) {
                        spans = spanned.getSpans(0, length, SpanWatcher.class);
                    }
                } catch (Throwable unused) {
                }
                if (spans == null) {
                    spans = new SpanWatcher[0];
                }
            } else {
                spans = new SpanWatcher[0];
            }
            SpanWatcher[] spanWatcherArr = (SpanWatcher[]) spans;
            if (spanWatcherArr.length == 0) {
                trbVar.invalidate();
                return;
            }
            int length2 = spanWatcherArr.length;
            while (i < length2) {
                SpanWatcher spanWatcher = spanWatcherArr[i];
                ArrayList arrayList = a;
                if (arrayList != null && arrayList.isEmpty()) {
                    obj2 = obj;
                    spanWatcher.onSpanChanged(spannable, obj2, spanStart, spanEnd, spanStart, spanEnd);
                    break;
                    break;
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = obj;
                        spanWatcher.onSpanChanged(spannable, obj2, spanStart, spanEnd, spanStart, spanEnd);
                        break;
                    } else if (((Class) it.next()) == spanWatcher.getClass()) {
                        obj2 = obj;
                        break;
                    }
                }
                i++;
                obj = obj2;
            }
        }
    }
}
