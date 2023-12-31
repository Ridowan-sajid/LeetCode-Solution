import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    animals= animals.sort_values(by='weight',ascending=False)
    filt=animals['weight']>100
    animals=animals.loc[filt,'name']

    return pd.DataFrame(animals)
