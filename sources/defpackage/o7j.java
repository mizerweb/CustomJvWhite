package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o7j {
    public static final float[] a = {0.55f, 1.0f};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.text.style.ImageSpan[]] */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.text.style.ReplacementSpan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    public static final CharSequence a(CharSequence charSequence, TextView textView, int i) {
        int size;
        ?? r2;
        if (charSequence != null && !r5h.X0(charSequence)) {
            if (i <= 0) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
                return charSequence;
            }
            try {
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textView.getPaint(), i).setMaxLines(textView.getMaxLines()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setHyphenationFrequency(0).build();
                if (staticLayoutBuild.getLineCount() <= textView.getMaxLines()) {
                    return charSequence;
                }
                Object[] spans = null;
                textView.setEllipsize(null);
                int length = charSequence.length();
                try {
                    Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
                    if (spanned != null) {
                        spans = spanned.getSpans(0, length, ImageSpan.class);
                    }
                } catch (Throwable unused) {
                }
                ?? r13 = (ImageSpan[]) spans;
                SpannableString spannableString = new SpannableString(charSequence);
                int iK = gm0.K(textView.getPaint().measureText("  ", 0, 1));
                if (r13 != 0) {
                    int length2 = r13.length;
                    int i2 = 0;
                    size = 0;
                    while (i2 < length2) {
                        r2 = spannableString;
                        ?? r14 = r13[i2];
                        ?? r16 = r2;
                        size = size + iK + r14.getSize(textView.getPaint(), r16, r2.getSpanStart(r14), r2.getSpanEnd(r14), textView.getPaint().getFontMetricsInt());
                        i2++;
                        r2 = r16;
                    }
                    r2 = spannableString;
                } else {
                    size = 0;
                }
                int iK2 = ((i - size) - gm0.K(textView.getPaint().measureText("…", 0, 1))) - iK;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int maxLines = textView.getMaxLines() - 1;
                for (int i3 = 0; i3 < maxLines; i3++) {
                    spannableStringBuilder.append(staticLayoutBuild.getText().subSequence(staticLayoutBuild.getLineStart(i3), staticLayoutBuild.getLineEnd(i3)));
                }
                int lineStart = staticLayoutBuild.getLineStart(maxLines);
                CharSequence charSequenceY1 = r5h.y1(staticLayoutBuild.getText().subSequence(lineStart, lineStart + textView.getPaint().breakText(charSequence, lineStart, staticLayoutBuild.getLineEnd(maxLines), true, iK2, null)));
                spannableStringBuilder.append(charSequenceY1);
                if (!cqk.d(charSequenceY1, charSequence)) {
                    spannableStringBuilder.append((CharSequence) "…");
                    if (r13 != 0) {
                        for (?? r3 : r13) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            sb8.b(spannableStringBuilder, (char) 8203, r3);
                        }
                    }
                }
                return new SpannedString(spannableStringBuilder);
            } catch (Exception unused2) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxLines(1);
            }
        }
        return charSequence;
    }

    public static void b(String str, String str2) {
        if (Log.isLoggable(str, 3)) {
            Log.d(str, str2);
        }
    }

    public static final PointF c(Context context) {
        k4f k4fVarO = f55.o(context);
        return new PointF(zo5.D(16.0f, yl5.d().getDisplayMetrics().density, zo5.D(l1d.a.b, yl5.d().getDisplayMetrics().density, k4fVarO.b)), zo5.D(12.0f, yl5.d().getDisplayMetrics().density, zo5.D(l1d.a.a, yl5.d().getDisplayMetrics().density, k4fVarO.a)) - k4fVarO.f);
    }

    public static final void d(ar arVar, boolean z) {
        if (z) {
            arVar.getWindow().addFlags(6815872);
        } else {
            arVar.getWindow().clearFlags(6815872);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            arVar.setShowWhenLocked(z);
            arVar.setTurnScreenOn(z);
        }
    }

    public static final Drawable e(int i, int i2, Context context) {
        Drawable drawableMutate = context.getDrawable(i).mutate();
        sb8.m0(i2, drawableMutate);
        return drawableMutate;
    }

    public static final void f(float f, View view) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new i11(1, f));
    }

    public static final void g(Space space, int i) {
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) == i) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) space.getLayoutParams();
        marginLayoutParams2.bottomMargin = i;
        space.setLayoutParams(marginLayoutParams2);
    }

    public static final void h(ImageView imageView, int i) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) == i) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams2.topMargin = i;
        imageView.setLayoutParams(marginLayoutParams2);
    }

    public static final void i(ViewGroup viewGroup, boolean z) {
        int i = z ? 0 : 4;
        if (viewGroup.getVisibility() != i) {
            viewGroup.setVisibility(i);
        }
    }

    public static void j(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }
}
