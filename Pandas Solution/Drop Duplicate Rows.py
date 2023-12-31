import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    filt=(customers.drop_duplicates(subset="email",keep='first'))
    return filt
