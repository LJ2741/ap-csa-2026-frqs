
public int moreHistoryThanMathAbsences() {
    int count = 0;

    for (CourseRecord mcr : mathList) {
        for (CourseRecord hcr : historyList) {
            if (mcr.getStudentID().equals(hcr.getStudentID()) && hcr.getAbsences() > mcr.getAbsences()) {
                count++;
            }
        }
    }

    return count;
}
