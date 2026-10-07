package defpackage;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class ygb implements ahb {
    public final long b;
    public final long c;

    public ygb(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final Date a(Date date) {
        int year = date.getYear();
        int month = date.getMonth();
        int date2 = date.getDate();
        lw5 lw5Var = lw5.HOURS;
        long j = this.c;
        return new Date(year, month, date2, (int) ew5.s(j, lw5Var), (int) (ew5.s(j, lw5.MINUTES) % 60));
    }

    public final boolean b() {
        Date time = Calendar.getInstance().getTime();
        Date dateC = c(time);
        Date dateA = a(time);
        if ((time.compareTo(dateC) < 0 || time.compareTo(dateA) > 0) && dateC.compareTo(dateA) > 0) {
            dateC.setTime(dateC.getTime() - 86400000);
        } else if (dateA.compareTo(dateC) < 0) {
            dateA.setTime(dateA.getTime() + 86400000);
        }
        return time.compareTo(dateC) >= 0 && time.compareTo(dateA) < 0;
    }

    public final Date c(Date date) {
        int year = date.getYear();
        int month = date.getMonth();
        int date2 = date.getDate();
        lw5 lw5Var = lw5.HOURS;
        long j = this.b;
        return new Date(year, month, date2, (int) ew5.s(j, lw5Var), (int) (ew5.s(j, lw5.MINUTES) % 60));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygb)) {
            return false;
        }
        ygb ygbVar = (ygb) obj;
        return ew5.f(this.b, ygbVar.b) && ew5.f(this.c, ygbVar.c);
    }

    public final int hashCode() {
        ghb ghbVar = ew5.b;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return nbh.w("Schedule(startTime=", ew5.t(this.b), ", endTime=", ew5.t(this.c), ")");
    }
}
