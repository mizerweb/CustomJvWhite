package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.text.Spanned;
import androidx.media3.session.MediaSessionService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class brl {
    public static final int a(Spanned spanned) {
        Object[] spans;
        int iHashCode = spanned.toString().hashCode();
        try {
            spans = spanned.getSpans(0, spanned.length(), Object.class);
        } catch (Throwable unused) {
            spans = null;
        }
        if (spans == null) {
            return iHashCode;
        }
        int length = (iHashCode * 31) + spans.length;
        for (Object obj : spans) {
            if (obj != null) {
                if (obj != spanned) {
                    length = (length * 31) + obj.hashCode();
                }
                length = spanned.getSpanFlags(obj) + ((spanned.getSpanEnd(obj) + ((spanned.getSpanStart(obj) + (length * 31)) * 31)) * 31);
            }
        }
        return length;
    }

    public static PendingIntent b(MediaSessionService mediaSessionService, int i, Intent intent) {
        return PendingIntent.getForegroundService(mediaSessionService, i, intent, 67108864);
    }

    public static final boolean c(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence instanceof Spanned ? a((Spanned) charSequence) : charSequence.hashCode()) == (charSequence2 instanceof Spanned ? a((Spanned) charSequence2) : charSequence2.hashCode());
    }
}
