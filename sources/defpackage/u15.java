package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class u15 implements qmc {
    public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // defpackage.qmc
    public final Object n(Uri uri, x25 x25Var) throws IOException {
        String line = new BufferedReader(new InputStreamReader(x25Var, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = a.matcher(line);
            if (!matcher.matches()) {
                throw ParserException.b(null, "Couldn't parse timestamp: " + line);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j2 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw ParserException.b(e, null);
        }
    }
}
