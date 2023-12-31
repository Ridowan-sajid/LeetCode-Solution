import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    filt = (students['student_id']==101)
    return (students.get(filt)[['name','age']])
